## 💡 **Java osztályok elnevezése és fájlkezelés**

### 📁 **Fájlnév és osztálynév összhangja**
Ha egy osztályt **`public`** kulcsszóval látsz el (mint nálunk a `Main` osztály), akkor:
- A fájlnak **pontosan ugyanazt a nevet kell viselnie**, mint az osztálynak.
- Tehát ha az osztály neve `Main`, a fájlt `Main.java` néven kell elmenteni.

📌 **Fontos**: Ha az osztály neve nem egyezik a fájlnévvel, a fordító hibát ad (compile time error).

---

## ✍️ **Java osztályelnevezési konvenciók**

Java-ban ajánlott:
- Az osztályneveket **nagy kezdőbetűvel** írni.
- **CamelCase** formátumot használni (például: `MyFirstClass`).
- Nem ajánlott aláhúzás (`_`) vagy dollárjel (`$`) használata osztálynevekben.

---

## 🧪 **Fordítás és futtatás parancssorból**

Ha `HelloWorld.java` nevű fájlt írsz, a következő lépések kellenek:

#### 📂 Navigálj a fájl helyére:
```bash
cd /az/elérési/útvonal/
```
*A `cd` a "change directory" rövidítése, vagyis könyvtárváltás.*

#### ⚙️ Fordítás:
```bash
javac HelloWorld.java
```
Ez létrehoz egy `HelloWorld.class` fájlt, amely tartalmazza a **Java bájtkódot**.

#### ▶️ Futtatás:
```bash
java HelloWorld
```
(Nem kell `.class` a végére!)

Ha minden rendben, a konzolon megjelenik:
```
Hello, World!
```

---

## ⚠️ Hiba: `'javac' is not recognized` Windows rendszeren

Ha ilyen hibaüzenetet kapsz, annak oka, hogy a `javac` parancs nincs hozzáadva a környezeti változókhoz (PATH).

### 🛠️ Megoldás Windows alatt:
1. Keresd meg a `javac.exe` elérési útját (általában itt található):
   ```
   C:\Program Files\Java\jdk1.x.x_xx\bin
   ```
2. Másold ki ezt az elérési utat.
3. Nyisd meg:
    - **Vezérlőpult > Rendszer > Speciális rendszerbeállítások > Környezeti változók**
    - Keresd meg a `PATH` nevű változót, szerkeszd.
    - Illeszd be az útvonalat az elejére, **pontosvesszővel elválasztva** a többitől:
      ```
      C:\Program Files\Java\jdk1.x.x_xx\bin;[meglévő értékek...]
      ```

🔁 Ezután újraindíthatod a terminált, és a `javac` már működni fog minden könyvtárból.

---

## 🐧 **Linux rendszereken**
Linux alatt is hasonló, csak `.bashrc` vagy `.zshrc` fájlban kell beállítani a PATH-ot:
```bash
export PATH=$PATH:/opt/java/jdk1.x.x_xx/bin
```

---

## ℹ️ `javac` és `java` parancsok

- `javac` = **Java fordító**, amely `.java` fájlt lefordít `.class` fájllá.
- `java` = **Java futtató**, amely a `.class` fájlt elindítja a JVM-en belül.

Verzióellenőrzés:
```bash
java -version
javac -version
```

---

## 🧠 **A `main` metódus jelentése**

A Java programok belépési pontja a `main` metódus:

```java
public static void main(String[] args)
```

### Mit jelent ez?

| Rész | Jelentés |
|------|----------|
| `public` | Mindenhonnan elérhető |
| `static` | Nem kell példányosítani az osztályt |
| `void` | Nem ad vissza értéket |
| `String[] args` | Parancssori argumentumokat fogad |

💬 Az `args` csak egy változónév, bárhogy elnevezhető, például `adatok`, `bemenet`, stb.

---

## 🔎 A `System.out.println()` részletesen

```java
System.out.println("Hello, World!");
```

| Rész | Jelentés |
|------|----------|
| `System` | A `java.lang` csomag része |
| `out` | A `System` osztály `PrintStream` típusú mezője |
| `println` | Metódus, amely kiírja a szöveget és új sort kezd |
| `"Hello, World!"` | Sztring literál (idézőjelbe tett szöveg) |
| `;` | Sorvége — minden Java utasítás `;` jellel végződik |

---

## 🏈 Objektumorientált példa: focicsapat

Ahogy a te kódod is mutatja:
```java
public class Csapat {
    Tag member;
    ...
}
```

Ez egy **egytagú focicsapat** modellje. Később, mikor tömböket (array-eket) vagy listákat tanulsz, bővítheted több tagra is!

