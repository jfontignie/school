package school

/**
 * A session corresponds to a course in a particular classroom at a certain time.
 */
class Session {

    static belongsTo = [course: Course, classroom: Classroom]

    WorkingHour workingHour
    Teacher teacher

    Set<Student> students

    Date dateCreated
    Date lastUpdated
    
    static constraints = {
    }
}
