import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Seance {
	private LocalDate date; 
	private LocalTime heureDebut,heureFin;
	
	public Seance(LocalDate date, LocalTime heureDebut, LocalTime heureFin) {
		this.date = date;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seance other = (Seance) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (heureDebut == null) {
			if (other.heureDebut != null)
				return false;
		} else if (!heureDebut.equals(other.heureDebut))
			return false;
		return true;
	}

	
	@Override
	public String toString() {

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Duration dr = Duration.between(heureDebut, heureFin);
		return "Seance [date=" + df.format(date)+ ", heureDebut=" + heureDebut + ", Duree=" + dr.toHours()+"h:" +dr.toMinutes()+ "]";
		
	}
	
	public int getDuree() {
		Duration dr = Duration.between(heureDebut, heureFin);
		int sum =0 ; 
		sum += (int) dr.toMinutes();
		return sum;
	}
	
}
