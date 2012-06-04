import school.Degree
import school.Student
import school.Teacher

class BootStrap {

    private static String validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_"

    def init = { servletContext ->

        //For simple tests: 3 degrees, 10 teachers, 100 students


        Degree d1 = Degree.findByName("1") ?: new Degree(name: "1").save(failOnError: true)
        Degree d2 = Degree.findByName("2") ?: new Degree(name: "2").save(failOnError: true)
        Degree d3 = Degree.findByName("3") ?: new Degree(name: "3").save(failOnError: true)


        assert d1 != null
        assert d2 != null
        assert d3 != null

        Degree[] d = [d1, d2, d3]

        Random random = new Random()
        if (!Student.count()) {


            for (i in 1..100) {
                def name = ""
                for (j in 0..10) {
                    name += validChars.charAt(random.nextInt(validChars.size()))
                }

                new Student(firstName: name, lastName: name, degree: d[random.nextInt(d.size())]).save(failOnError: true)
            }

            for (i in 1..10){
                def name = ""
                for (j in 0..10) {
                    name += validChars.charAt(random.nextInt(validChars.size()))
                }

                new Teacher(firstName: name, lastName: name, degree: d[random.nextInt(d.size())]).save(failOnError: true)
            }
        }


    }

    def destroy = {
    }

}
