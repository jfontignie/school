package school

abstract class SchoolConstraint {

    String name
    Priority priority

    static constraints = {
    }



}

class MatterSchoolConstraint extends SchoolConstraint {

    Matter matter
    Classroom room

    static constraints = {
        matter(nullable: false)
    }

}

class AvailabilitySchoolConstraint extends SchoolConstraint {
    Teacher teacher
    Set<WorkingHour> hours

    static constraints = {
        teacher(nullable: false)

    }

}

class InvertSchoolConstraint extends SchoolConstraint {

    SchoolConstraint constraint

    static constraints = {
        constraint(nullable: false)
    }
}

class MaxxSizeSchoolConstraint extends SchoolConstraint {
    Session session
    int size

    static constraints = {
        session(nullable: false)
        size(min: 0)
    }
}