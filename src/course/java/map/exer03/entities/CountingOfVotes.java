package course.java.map.exer03.entities;

public class CountingOfVotes implements Comparable<CountingOfVotes>{

	private String name;
	private Integer voteCount;

	public CountingOfVotes() {
	}

	public CountingOfVotes(String name, Integer voteCount) {
		this.name = name;
		this.voteCount = voteCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountingOfVotes other = (CountingOfVotes) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + ": " + voteCount;
	}

	@Override
	public int compareTo(CountingOfVotes other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}

}
