package org.acme;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import net.fortuna.ical4j.model.Period;
import net.fortuna.ical4j.model.Recur;
import net.fortuna.ical4j.model.WeekDay;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.property.RRule;
import net.fortuna.ical4j.model.property.Transp;
import net.fortuna.ical4j.model.property.XProperty;
import net.fortuna.ical4j.transform.recurrence.Frequency;
import net.fortuna.ical4j.util.RandomUidGenerator;
import org.junit.jupiter.api.Test;

public class ICal4JTest {

    @Test
    void shouldGetRecurrenceByInstant() {
        Recur recurence = new Recur.Builder()
                .frequency(Frequency.WEEKLY)
                .dayList(List.of(WeekDay.MO, WeekDay.TU, WeekDay.WE, WeekDay.TH, WeekDay.FR))
                .interval(2)
                .until(OffsetDateTime.of(2100, 1, 23, 0, 0, 0, 0, ZoneOffset.UTC))
                .build();
        ZonedDateTime start = ZonedDateTime.of(2100, 1, 2, 6, 0, 0, 0, ZoneId.of("Europe/Berlin"));
        ZonedDateTime end = ZonedDateTime.of(2100, 1, 2, 14, 0, 0, 0, ZoneId.of("Europe/Berlin"));
        VEvent event = new VEvent(start, end, "Test")
                .add(new RandomUidGenerator().generateUid())
                .add(new XProperty("MyId", UUID.randomUUID().toString()))
                .add(new RRule<>(recurence))
                .add(new Transp(Transp.VALUE_OPAQUE));
        Set<Period<Temporal>> calculateRecurrenceSet = event.calculateRecurrenceSet(
                new Period<>(OffsetDateTime.now().minusYears(1).toInstant(),
                        OffsetDateTime.now().plusYears(1).toInstant()));
        calculateRecurrenceSet.forEach(x -> System.out.println("XXXXX _ " + x));
    }
    
    @Test
    void shouldGetRecurrenceByOffsetDateTime() {
        Recur recurence = new Recur.Builder()
                .frequency(Frequency.WEEKLY)
                .dayList(List.of(WeekDay.MO, WeekDay.TU, WeekDay.WE, WeekDay.TH, WeekDay.FR))
                .interval(2)
                .until(OffsetDateTime.of(2100, 1, 23, 0, 0, 0, 0, ZoneOffset.UTC))
                .build();
        ZonedDateTime start = ZonedDateTime.of(2100, 1, 2, 6, 0, 0, 0, ZoneId.of("Europe/Berlin"));
        ZonedDateTime end = ZonedDateTime.of(2100, 1, 2, 14, 0, 0, 0, ZoneId.of("Europe/Berlin"));
        VEvent event = new VEvent(start, end, "Test")
                .add(new RandomUidGenerator().generateUid())
                .add(new XProperty("MyId", UUID.randomUUID().toString()))
                .add(new RRule<>(recurence))
                .add(new Transp(Transp.VALUE_OPAQUE));
        Set<Period<Temporal>> calculateRecurrenceSet = event.calculateRecurrenceSet(
                new Period<>(OffsetDateTime.now().minusYears(1),
                        OffsetDateTime.now().plusYears(1)));
        calculateRecurrenceSet.forEach(x -> System.out.println("XXXXX _ " + x));
    }

}
