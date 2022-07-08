//Runtime: 116 ms, faster than 93.19% of Java online submissions for Find Median from Data Stream.
//Memory Usage: 59.6 MB, less than 99.91% of Java online submissions for Find Median from Data Stream.
class MedianFinder {
    private PriorityQueue<Double> minpq;
    private PriorityQueue<Double> maxpq;
    private boolean isEven;
    
    public MedianFinder() {
        minpq = new PriorityQueue<Double>(Collections.reverseOrder());
        maxpq = new PriorityQueue<Double>();
        isEven = true;
    }
    
    public void addNum(int num) {
        double d = num;
        if (isEven && (minpq.isEmpty() || d >= minpq.peek())) {
            maxpq.add(d);
            isEven = false;
        }
        else if (isEven && (minpq.isEmpty() || d < minpq.peek())) {
            double minMax = minpq.poll();
            maxpq.add(minMax);
            minpq.add(d);
            isEven = false;
        }
        else if (!isEven && d > maxpq.peek()) {
            double maxMin = maxpq.poll();
            minpq.add(maxMin);
            maxpq.add(d);
            isEven = true;
        }
        else {
            minpq.add(d);
            isEven = true;
        }
    }
    
    public double findMedian() {
        if (isEven) return (maxpq.peek() + minpq.peek())/2;
        else return maxpq.peek(); 
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
