package edu.mum.waa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Block_Course")
public class BlockCourse {
	
	 @Column(name = "BlockId")
	 private Long blockId;
	 
	 @Column(name = "CourseId")
	 private Long courseId;
	 
	 @Column(name = "ProfessorId")
	 private Long professorId;

	public Long getBlockId() {
		return blockId;
	}

	public void setBlockId(Long blockId) {
		this.blockId = blockId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Long professorId) {
		this.professorId = professorId;
	}

	
	
}
