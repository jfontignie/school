package school

/**
 * A student has a certain degree and can be in a group of student
 */
class Student extends Person {

    Degree degree
    Set<Session> sessions

    static hasMany = [sessions: Session]

    static constraints = {
    }
}
