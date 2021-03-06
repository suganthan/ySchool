package org.yarlithub.yschool.model.obj.yschoolLite.iface;
import org.yarlithub.yschool.model.obj.yschoolLite.Student;
import org.yarlithub.yschool.model.obj.yschoolLite.Subject;


/** 
 * Object interface mapping for hibernate-handled table: Student_has_OptionalSubject.
 * @author autogenerated
 */

public interface IStudentHasOptionalsubjectPK {



    /**
     * Return the value associated with the column: studentIdstudent.
	 * @return A Student object (this.studentIdstudent)
	 */
	Student getStudentIdstudent();
	

  
    /**  
     * Set the value related to the column: studentIdstudent.
	 * @param studentIdstudent the studentIdstudent value you wish to set
	 */
	void setStudentIdstudent(final Student studentIdstudent);

    /**
     * Return the value associated with the column: subjectIdsubject.
	 * @return A Subject object (this.subjectIdsubject)
	 */
	Subject getSubjectIdsubject();
	

  
    /**  
     * Set the value related to the column: subjectIdsubject.
	 * @param subjectIdsubject the subjectIdsubject value you wish to set
	 */
	void setSubjectIdsubject(final Subject subjectIdsubject);

	// end of interface
}