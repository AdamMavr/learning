// public - разрешает доступ к файлу везде на протяжении проекта
// private - разрешает доступ только в пределах класса
// default - по умолчанию (если не ставить модификатор доступа), и доступно в пределах пакета
// protected - разрешает доступ в пределах одного пакета, и всем подклассам вне пакета

package Lesson28_AccessModifers;

import Lesson28_AccessModifers.Packet1.Person;

public class Test {
    public static void main(String[] args) {
        Person adam = new Person();
        adam.name = "Adam";
    }
}
