#include <iostream> 
#include <list>
using namespace std;

class Point {
    private: 
        int x;
        int y;
    public:
        Point(int x, int y) {
            this->x = x;
            this->y = y;
        }
        void toString() {
            cout << "Point: (" << this->x << ";" << this->y << ")" << endl;
        }
};

int main() {
    Point p(1, 2);
    p.toString();
    return 0;
}