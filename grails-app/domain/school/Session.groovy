package school

class Session {

    static belongsTo = [course: Course, classroom: Classroom]

    WorkingHour workingHour
    Teacher teacher
    Class clazz
    
    static constraints = {
    }
}
