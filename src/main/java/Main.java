public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jane", "Doe", "jane.doe@example.com", "female");

        // Print information about the person
        System.out.println("Person:");
        System.out.println("Full Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Gender: " + person.getGender());
        System.out.println(); // line break

//        Student student = new Student(
//                101,                                // ID
//                "Brian",                            // First name
//                "Vega-Solano",                      // Last name
//                "brianvs@example.com",              // Email
//                "male",                             // Gender
//                "https://github.com/BrianVegaSol",  // GitHub link
//                "https://www.linkedin.com/in/brianvs/", // LinkedIn profile
//                "Crash n' Burn",                    // Coding nickname
//                "0",                                // Codewars XP (as String)
//                "img/Avatar_Student_Male.jpg",      // Image URL
//                "Windows",                          // Device type
//                0,                                  // Workbook page number
//                "81"                                // Currently working on (page/task)
//        );
        Student student = new Student(
                100,
                "Jiward",
                "Torres",
                "jiwardtorres@yahoo.com",
                "Male",
                "https://github.com/JHT-Gitt",
                "https://www.linkedin.com/in/jiward-torres/",
                "FinnDaDog",
                "0",
                "https://media.licdn.com/dms/image/v2/D5603AQEVhz2IQLwHCQ/profile-displayphoto-shrink_800_800/B56ZXeZaJqHoAc-/0/1743192957843?e=1752105600&v=beta&t=GZwz1Yn3xmgRTRMM8C5sjJQxmDBBkHoT0e9vLv7XHIE",
                "Windows",
                0,
                "79"
        );
        System.out.println("\nStudent:");
        System.out.println("Full Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Nickname: " + student.getCodingNickname());
        System.out.println("GitHuB: " + student.getGithub());
        System.out.println("Device: " + student.getDeviceType());
        System.out.println("Currently Working: " + student.getCurrentlyWorkingOn() );

    }
}
