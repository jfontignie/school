package school

/**
 * A teacher is known to present multiple matters and has a few sessions to present
 */
class Teacher extends Person{

    static hasMany = [matters:Matter, sessions: Session]

    static constraints = {
    }
}
