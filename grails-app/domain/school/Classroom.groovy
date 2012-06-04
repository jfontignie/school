package school

/**
 * A room has multiple sessions
 */
class Classroom {

    String name

    Date dateCreated
    Date lastUpdated

    static hasMany = [sessions: Session]

    static constraints = {
    }
}
