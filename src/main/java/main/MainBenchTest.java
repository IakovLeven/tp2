package main;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class MainBenchTest {

    private List<Integer> numbers;

    @Setup
    public void setup() {
        numbers = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            numbers.add(i);
        }
    }

    @Benchmark
    public int testMin() {
        return Main._min(numbers);
    }

    @Benchmark
    public int testMax() {
        return Main._max(numbers);
    }

    @Benchmark
    public long testSum() {
        return Main._sum(numbers);
    }

    @Benchmark
    public long testMult() {
        return Main._mult(numbers);
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}