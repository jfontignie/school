package school

/**
 * A working hour is a period of the week where a course can be given
 */
class WorkingHour {

    DayOfWeek dayOfWeek
    Hour hour

    Date dateCreated
    Date lastUpdated

    static constraints = {
    }
}
