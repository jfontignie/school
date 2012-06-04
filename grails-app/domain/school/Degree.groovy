package school

/**
 * A degree is a year in the school process.
 */
class Degree {

    String name


    Date dateCreated
    Date lastUpdated

    static constraints = {
        name(unique: true)
    }
}
