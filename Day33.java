
   // Annotation : Annotation ek metadata tag hai jo code ke upar @ lagakar likha jaata hai — ye khud koi logic nahi karta, balki compiler ya JVM ko extra information deta hai ki is code ke sath kya karna hai.


   //Real-life scenario Example: Socho tum ek Company HR System bana rahe ho, jisme har Employee method pe tag lagana hai ki "ye kaam kis role ke liye allowed hai" — jaise office mein har cabin ke bahar sticker laga ho "Sirf Manager ke liye" ya "HR Only"

   import java.lang.annotation.*;
import java.lang.reflect.Method;

// ---- Custom Annotation 1 ----
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleRequired {
    String value();
}

// ---- Custom Annotation 2 ----
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface AuditLog {
    String action();
}

// ---- HR System class jisme annotations use hui ----
class HRSystem {

    @RoleRequired("MANAGER")
    @AuditLog(action = "SALARY_APPROVAL")
    public void approveSalaryHike() {
        System.out.println("Salary hike approved");
    }

    @RoleRequired("HR")
    @AuditLog(action = "EMPLOYEE_ONBOARD")
    public void onboardEmployee() {
        System.out.println("New employee onboarded");
    }

    @Deprecated
    public void oldLeaveSystem() {
        System.out.println("Purana leave process - use mat karo");
    }
}

// ---- Main class jo annotations ko runtime pe padhega ----

public class Day33 {
  
  public static void main(String[] args) throws Exception {
        Class<?> clazz = HRSystem.class;
        HRSystem obj = new HRSystem();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RoleRequired.class)) {
                RoleRequired role = method.getAnnotation(RoleRequired.class);
                System.out.println(method.getName() + " -> Required Role: " + role.value());
            }
            if (method.isAnnotationPresent(AuditLog.class)) {
                AuditLog log = method.getAnnotation(AuditLog.class);
                System.out.println(method.getName() + " -> Audit Action: " + log.action());
            }
        }

        String currentUserRole = "MANAGER";
        Method targetMethod = clazz.getMethod("approveSalaryHike");

        if (targetMethod.isAnnotationPresent(RoleRequired.class)) {
            RoleRequired required = targetMethod.getAnnotation(RoleRequired.class);
            if (required.value().equals(currentUserRole)) {
                targetMethod.invoke(obj);
            } else {
                System.out.println("Access Denied - " + currentUserRole + " is not authorized");
            }
        }
    }
}[++]
