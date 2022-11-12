package su.hostile.cxfsoapproducer.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "ImportData", namespace = "http://su.hostile.soap/")
@XmlAccessorType(XmlAccessType.FIELD)
public class ImportData {

    public ImportData() {
    }

    @XmlElement(name = "Id", namespace = "http://su.hostile.soap/")
    private String id;

    @XmlElement(name = "Type", namespace = "http://su.hostile.soap/")
    private String type;

    @XmlElement(name = "Value", namespace = "http://su.hostile.soap/")
    private String value;

    @XmlElement(name = "Child", namespace = "http://su.hostile.soap/")
    private List<InnerObject> child;

    @Override
    public String toString() {
        return "ImportData{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", child=" + child +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<InnerObject> getChild() {
        return child;
    }

    public void setChild(List<InnerObject> child) {
        this.child = child;
    }
}
