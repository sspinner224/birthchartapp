import java.time.Duration;
import java.time.LocalDate;

public class DateHandler {
	
	private LocalDate currentDate;
	private LocalDate previousDate;
	//private AstrologyInfo astrologyInfo;
	
	
	
	DateHandler(LocalDate currentDate, LocalDate previousDate) {
		this.previousDate = previousDate;
		this.currentDate = currentDate;
		
	}
	
	public long getDaysDifference() {
		
		Duration difference = Duration.between(previousDate.atStartOfDay(), currentDate.atStartOfDay());
		long days = difference.toDays();
		return days;
		
	}
	

}
