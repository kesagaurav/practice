import java.sql.PreparedStatement;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// list candidate names from Pune city

		System.out.println("List of Pune Candidates:");
		InterviewRepository.candidateList.stream().filter(e -> e.getCity().equals("Pune")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		// list city and count of candidates per city
		System.out.println("Candidate count per city");
		Map<String, Long> map4 = InterviewRepository.candidateList.stream().collect(Collectors
				.groupingBy(Candidate::getCity, Collectors.mapping(Candidate::getName, Collectors.counting())));
		map4.forEach((x, y) -> System.out.println(x + "  =  " + y));
		// list technical expertise and count of candidates
		System.out.println("Candidate count by Technical Expertise");
		Map<String, Long> map5 = InterviewRepository.candidateList.stream()
				.collect(Collectors.groupingBy(Candidate::getTechnicalExpertise,
						Collectors.mapping(Candidate::getTechnicalExpertise, Collectors.counting())

				));
		// map5.forEach((x, y) -> System.out.println(x + " = " + y));

		for (Map.Entry<String, Long> count : map5.entrySet()) {
			System.out.println("technical expertise is " + count.getKey() + " and his count  " + count.getValue());
		}

		// list fresher candidates
		System.out.println("Fresher Candidate list");
		InterviewRepository.candidateList.stream().filter(e -> e.getYearsOfExperience() <= 1)
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));
		// listing candidates with highest experience
		System.out.println("Sorted List of Candidates by Experience");
		Integer can = InterviewRepository.candidateList.stream().map(e -> e.getYearsOfExperience())
				.max((x, y) -> x.compareTo(y)).get();
		System.out.println("highest experience " + can);
		// sort the candidates by city name
		printLine();
		System.out.println("Sorted List of Candidates by City Name");
		Collections.sort(InterviewRepository.candidateList, (Candidate c1, Candidate c2) -> {
			String s1 = c1.getCity();
			String s2 = c2.getCity();
			return s1.compareTo(s2);
		});
		InterviewRepository.getCandidateList().forEach(e -> System.out.println(e.getCity() + "  " + e.getName()));
	}

	private static void printLine() {
		System.out.println("======================================================");
	}

}
