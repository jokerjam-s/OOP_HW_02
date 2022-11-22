package gb.hw.education.data.classes;

import gb.hw.education.data.interfaces.IGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EducationGroup implements IGroup {
    private int groupNo;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    /**
     * Конструктор с параметрами
     * @param groupNo   - номер группы
     * @param name      - название
     * @param teacher   - преподаватель
     * @param students  - список студентов
     */
    public EducationGroup(int groupNo, String name, Teacher teacher, List<Student> students) {
        this.groupNo = groupNo;
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    /**
     * Конструктор с 1м параметром
     * @param groupNo   - номер группы
     */
    public EducationGroup(int groupNo) {
        this(groupNo, "", null, new ArrayList<>());
    }

    /**
     * Добавление студента
     * @param student
     */
    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudent(Student student){
        students.remove(student);
    }

    public void deleteStudent(int position){
        students.remove(position);
    }

    @Override
    public String toString() {
        return "Группа №" + groupNo +
                ", название: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationGroup that = (EducationGroup) o;
        return groupNo == that.groupNo && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupNo, name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getGroupNo() {
        return this.groupNo;
    }

    @Override
    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }

}
