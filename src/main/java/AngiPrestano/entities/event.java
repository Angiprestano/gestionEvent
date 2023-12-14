package AngiPrestano.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class event {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    @Column(name = "date_event")
    private LocalDate dateEvent;
    private String description;
    private eventType eventType;
    @Column(name = "number_max_partecipate")
    private int numberMaxPartecipate;

    public event() {
    }

    public event(String title, LocalDate dateEvent, String description, AngiPrestano.entities.eventType eventType, int numberMaxPartecipate) {
        this.title = title;
        this.dateEvent = dateEvent;
        this.description = description;
        this.eventType = eventType;
        this.numberMaxPartecipate = numberMaxPartecipate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(LocalDate dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberMaxPartecipate() {
        return numberMaxPartecipate;
    }

    public void setNumberMaxPartecipate(int numberMaxPartecipate) {
        this.numberMaxPartecipate = numberMaxPartecipate;
    }

    public AngiPrestano.entities.eventType getEventType() {
        return eventType;
    }

    public void setEventType(AngiPrestano.entities.eventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dateEvent=" + dateEvent +
                ", description='" + description + '\'' +
                ", eventType=" + eventType +
                ", numberMaxPartecipate=" + numberMaxPartecipate +
                '}';
    }
}

