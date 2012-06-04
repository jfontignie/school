package school

/**
 * A room has multiple sessions
 */
class Classroom {

    Date dateCreated
    Date lastUpdated

    static hasMany = [sessions: Session]
    static constraints = {
    }
}
