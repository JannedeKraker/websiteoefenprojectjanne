import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class ColumnMichel {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String columnText;
    private LocalDate dateWhenColumnIsPlaced;
    public ColumnMichel(String title, String columnText, LocalDate dateWhenColumnIsPlaced) {
        this.title = title;
        this.columnText = columnText;
        this.dateWhenColumnIsPlaced = dateWhenColumnIsPlaced;
    }
    public ColumnMichel(String title){
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getColumnText() {
        return columnText;
    }

    public LocalDate getDateWhenColumnIsPlaced() {
        return dateWhenColumnIsPlaced;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setColumnText(String columnText) {
        this.columnText = columnText;
    }

    public void setDateWhenColumnIsPlaced(LocalDate dateWhenColumnIsPlaced) {
        this.dateWhenColumnIsPlaced = dateWhenColumnIsPlaced;
    }
}
