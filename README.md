# ELTEClothingIndustry

Készítsünk programot, amellyel szimulálni tudjuk ruhaipari bedolgozók (továbbiakban gazdálkodók) tevékenységét. 
A gazdálkodók saját otthonukban kötőgépeket üzemeltetnek, így jutnak bevételhez. 
Egy logisztikai központ gondoskodik az alapanyag kiszállításáról és a kész termék elszállításáról. 
A központ egy gép egy napi termelése után gazdálkodóknál üzemelő összes gép számának és az
aktív gazdálkodók számának arányában fizet hozamot az alábbiak szerint:

• ha a gépek száma nem haladja meg a gazdálkodók számát, akkor 10 egységet;

• ha a gépek száma nagyobb vagy egyenlő a gazdálkodók számának duplájával, akkor nincs hozam (0 egység);

• egyébként 10*gazdálkodók száma / gépek száma egységet.

Kezdetben minden gazdálkodónak egy gépe van, és a pénze 0 egység. 

Egy gép napi üzemeltetése 6 egység költséget igényel. 
Egy gazdálkodó napi jövedelme: a gépei által megtermelt hozamból le kell vonni a gépei üzemeltetési költségét. (A napi
jövedelem lehet veszteséges is.) 
Ha a gazdálkodónak van elég pénze és úgy látja jónak, akkor 18 egységért újabb gépet vásárolhat, 
de 3 gépnél nem lehet több gépe.

Lehetősége van gépet eladni a vételáron, ezzel eggyel csökkenti gépeinek számát. 
Egy gazdálkodó tönkremegy, ha negatív lesz a pénze.
Minden nap végén az addig tönkre nem ment gazdálkodók az aznapi jövedelmükkel megváltoztatják a pénzüket. 
Miután ez minden aktív gazdálkodó megtette, eldöntik miként folytatják tevékenységüket. 

Három dolgot tehetnek: nem változtatnak semmit, egy új gépet vehetnek, vagy eladhatnak egy gépet. 
Ha a döntésük végrehajtása után vagyonuk negatív, azaz tönkrementek, 
akkor vissza kell adniuk a gépeiket, de a gépek árát nem kapják vissza. 
Ha nem mentek tönkre, akkor a következő nap már a döntésüknek megfelelően folyik a termelés.

Háromféle gazdálkodót különböztetünk meg:

• Egyszerű: 
semmit nem változtat, végig egy gépet használ.

• Mohó: 
ha lehetősége van rá (több pénze van, mint egy gép ára és háromnál kevesebb gépe van) új gépet vesz.

• Gazdaságos: 
gépet vesz, 
ha háromnál kevesebb gépe van, 
több pénze van, mint a gép ára és 
egy gép hozama meghaladja az üzemeltetési költséget; 
elad gépet, 
ha egynél több gépe van 
és a pénze negatív 
vagy az erőforrás jövedelme nem haladja meg az üzemeltetési költséget.

A szimuláció adatait a program egy szöveges fájlból olvassa be. 
A fájl első sora megadja a napok számát, majd a gazdálkodók adatai következnek soronként. 
Egy karakter azonosítója a gazdálkodó fajtáját, amit szóköz után a gazdálkodó neve követ. 
Az azonosítók: E – egyszerű, M – mohó, G – gazdaságos.
A program kérje be a fájl nevét, majd a szimuláció végén írja ki a tönkre nem ment gazdák közül a leggazdagabbat. 
Ehhez valósítsuk meg a gazdálkodókat reprezentáló osztályokat, amelyek egy absztrakt gazdálkodó osztály leszármazottai.

Egy lehetséges bemenet:
20 nap,
G Szamito,
M Torekvo,
E szereny,
G okos.
