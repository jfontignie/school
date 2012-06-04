package school

class Teacher {

    static hasMany = [matters:Matter, sessions: Session]

    static constraints = {
    }
}
