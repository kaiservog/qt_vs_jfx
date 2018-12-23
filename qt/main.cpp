#include "mainwindow.h"
#include <QApplication>
#include <QDebug>
#include "chrono"
#include "ctime"


int main(int argc, char *argv[])
{
    auto start = std::chrono::system_clock::now();;
    QApplication a(argc, argv);
    for ( int i=0; i<11000; i++) {
        if(i==1000) {
            start = std::chrono::system_clock::now();
        }

        MainWindow w;
        w.show();
        w.hide();
    }

    auto end = std::chrono::system_clock::now();

    std::chrono::duration<double> elapsed_seconds = end-start;
    std::time_t end_time = std::chrono::system_clock::to_time_t(end);
    qDebug() << "finished computation at " << std::ctime(&end_time)
                  << "elapsed time: " << elapsed_seconds.count() << "s\n";

    return a.exec();
}
