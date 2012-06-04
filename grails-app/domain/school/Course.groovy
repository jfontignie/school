package school

/**
 * A course is a course given a matter and a degree. For example: biology: first year
 */
class Course {

    Matter matter

    String description
    Degree degree


    Date dateCreated
    Date lastUpdated

    static constraints = {
    }
}
