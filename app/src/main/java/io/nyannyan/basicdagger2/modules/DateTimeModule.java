package io.nyannyan.basicdagger2.modules;

import dagger.Module;
import dagger.Provides;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class DateTimeModule {

  @Singleton
  @Provides
  public Calendar provideCalendar() {
    return Calendar.getInstance();
  }

  @Singleton
  @Named ("dd-MMM-yyyy")
  @Provides
  public String provideDateType1(Calendar c) {

    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    return df.format(c.getTime());

  }

  @Singleton
  @Named ("dd-MMM-yy")
  @Provides
  public String provideDateType2(Calendar c) {

    SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
    return df.format(c.getTime());

  }

  @Singleton
  @Named ("yyyy-MM-dd HH:mm:ss")
  @Provides
  public String provideDateType3(Calendar c) {

    SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
    return df.format(c.getTime());

  }

}
