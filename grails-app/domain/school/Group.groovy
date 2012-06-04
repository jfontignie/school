package school

/**
 * A group corresponds to a logical group of students. Usually students are in a logical group.
 */
class Group {

    String name


    Date dateCreated
    Date lastUpdated

    static hasMany = [students: Student]

    static constraints = {
    }
}
