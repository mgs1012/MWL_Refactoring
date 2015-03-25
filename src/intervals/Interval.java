package intervals;

public class Interval {
	
	private double min;	
	private double max;
	private Opening opening;

	public Interval(double minimum, double maximum, Opening opening) {
		this.min = minimum;
		this.max = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (this.min + this.max)/2;
	}

	public boolean includes(double value) {
		switch (opening) {
		case BOTH_OPENED:
			return value > this.min && value < this.max;
		case LEFT_OPENED:
			return value > this.min && value <= this.max;
		case RIGHT_OPENED:
			return value >= this.min && value < this.max;
		case UNOPENED:
			return value >= this.min && value <= this.max;
		}
		return false;
	}
	
	public boolean includes(Interval interval) {
		
		if(includes(interval.min) && includes(interval.max)){
			
		}
		

		if(this.opening.equals(interval.opening)){
			return this.min <= interval.min && this.max >= interval.max;
		}else{
			
		}
		
		return false;
	}
	
	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public Opening getOpening() {
		return opening;
	}

	public void setOpening(Opening opening) {
		this.opening = opening;
	}

	public boolean intersectsWith(Interval interval) {
		//TODO
		return false;
	}

	public Interval intersection(Interval interval) {
		//TODO
		return null;
	}

	@Override
	public String toString() {
		return "( " + this.min + "," + this.max + " )";
	}

	@Override
	public boolean equals(Object object) {
		//TODO
		return false;
	}
}
