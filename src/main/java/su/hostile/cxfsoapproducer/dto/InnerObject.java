package su.hostile.cxfsoapproducer.dto;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Child", namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class InnerObject {

    public InnerObject() {
    }

    @XmlElement(name = "Name", namespace = "http://su.hostile.soap/")
    private String name;

    @XmlElement(name = "Age", namespace = "http://su.hostile.soap/")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
