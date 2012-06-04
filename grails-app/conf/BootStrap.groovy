import school.*

class BootStrap {

    private static String validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_"

    def init = { servletContext ->


        Hour h1 = new Hour(startHour: 8, startMinute: 15, duration: 45).save(failOnError: true)
        Hour h2 = new Hour(startHour: 9, startMinute: 05, duration: 45).save(failOnError: true)
        Hour h3 = new Hour(startHour: 10, startMinute: 00, duration: 45).save(failOnError: true)
        Hour h4 = new Hour(startHour: 10, startMinute: 50, duration: 45).save(failOnError: true)
        Hour h5 = new Hour(startHour: 11, startMinute: 40, duration: 45).save(failOnError: true)
        Hour h6 = new Hour(startHour: 12, startMinute: 30, duration: 45).save(failOnError: true)
        Hour h7 = new Hour(startHour: 13, startMinute: 20, duration: 45).save(failOnError: true)
        Hour h8 = new Hour(startHour: 14, startMinute: 10, duration: 45).save(failOnError: true)
        Hour h9 = new Hour(startHour: 15, startMinute: 00, duration: 45).save(failOnError: true)
        Hour h10 = new Hour(startHour: 15, startMinute: 50, duration: 45).save(failOnError: true)

        Hour[] hours = [h1, h2, h3, h4, h5, h6, h7, h8, h9, h10]

        for (day in DayOfWeek) {
            for (hour in hours)
                new WorkingHour(dayOfWeek: day, hour: hour).save(failOnError: true)
        }

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
        }
        if (!Teacher.count()) {
            for (i in 1..10) {
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
