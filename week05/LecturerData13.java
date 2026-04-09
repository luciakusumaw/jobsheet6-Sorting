package week05;

public class LecturerData13 {
    Lecturer13[] lecturerData;
    int idx;

    public LecturerData13(int size) {
        lecturerData = new Lecturer13[size];
        idx = 0;
    }

    public void add(Lecturer13 dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("Lecturer data is full!");
        }
    }

    public void print() {
        if (idx == 0) {
            System.out.println("No lecturer data available.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer13 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
        System.out.println("Data sorted by Age (ASC) using Bubble Sort.");
    }

    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIndex].age) {
                    maxIndex = j;
                }
            }
            Lecturer13 temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
        System.out.println("Data sorted by Age (DSC) using Selection Sort.");
    }
}