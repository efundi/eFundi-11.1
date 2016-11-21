package za.ac.nwu.model;

import java.util.HashSet;
import java.util.Set;

import za.ac.nwu.jobs.Utility;

public class Module {

    private String courseCode;

    private String courseLevel;

    private String courseModule;

    private Campus campus;

    private int year;

    private Set<Student> linkedStudents = new HashSet<Student>();

    private Set<Lecturer> linkedLecturers = new HashSet<Lecturer>();
    
//    private Integer methodOfDeliveryCode;
//
//    private Integer presentationCategoryCode;

    public Module(String courseCode, String courseLevel, String courseModule, Campus campus,
            int year) {
        this.courseCode = courseCode;
        this.courseLevel = courseLevel;
        this.courseModule = courseModule;
        this.campus = campus;
        this.year = year;
//        this.methodOfDeliveryCode = methodOfDeliveryCode;
//        this.presentationCategoryCode = presentationCategoryCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getCourseModule() {
        return courseModule;
    }

    public void setCourseModule(String courseModule) {
        this.courseModule = courseModule;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public int getYear() {
        return year;
    }    

//    public Integer getMethodOfDeliveryCode() {
//		return methodOfDeliveryCode;
//	}
//
//	public void setMethodOfDeliveryCode(Integer methodOfDeliveryCode) {
//		this.methodOfDeliveryCode = methodOfDeliveryCode;
//	}
//
//	public Integer getPresentationCategoryCode() {
//		return presentationCategoryCode;
//	}
//
//	public void setPresentationCategoryCode(Integer presentationCategoryCode) {
//		this.presentationCategoryCode = presentationCategoryCode;
//	}

	public Set<Student> getLinkedStudents() {
        return linkedStudents;
    }

    public void setLinkedStudents(Set<Student> linkedStudents) {
        this.linkedStudents = linkedStudents;
    }

    public Set<Lecturer> getLinkedLecturers() {
        return linkedLecturers;
    }

    public void setLinkedLecturers(Set<Lecturer> linkedLecturers) {
        this.linkedLecturers = linkedLecturers;
    }

    public void addLinkedLecturer(Lecturer lecturer) {
        this.linkedLecturers.add(lecturer);
    }

    /**
     * Course Management Helper method - CanonicalCourse eid example: WISK 111
     */
    public String getCanonicalCourseReference() {
        return courseCode + " " + courseLevel + courseModule;
    }

    /**
     * Course Management Helper method - CourseOffering eid example: WISK 111 P 2011
     */
    public String getCourseOfferingReference() {
        return getCanonicalCourseReference() + " " + campus.getCode() + " " + year;
    }

    /**
     * Course Management Helper method - EnrollmentSet eid example: WISK 111 P 2011 ES
     */
    public String getEnrollmentSetReference() {
        return getCourseOfferingReference() + " ES";
    }

    @Override
    public int hashCode() {
//        return Utility.hashCode(courseCode, courseLevel, courseModule, campus, year, methodOfDeliveryCode, presentationCategoryCode);
        return Utility.hashCode(courseCode, courseLevel, courseModule, campus, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof Module) {
            Module other = (Module) obj;
            return Utility.equals(courseCode, other.courseCode)
                    && Utility.equals(courseLevel, other.courseLevel)
                    && Utility.equals(courseModule, other.courseModule)
                    && campus == other.campus
                    && year == other.year;
//                            && Utility.equals(methodOfDeliveryCode, other.methodOfDeliveryCode)
//                            && Utility.equals(presentationCategoryCode, other.presentationCategoryCode);
        }
        else {
            return false;
        }
    }
}
