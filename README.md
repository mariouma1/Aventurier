# 🧭 Projet Aventurier

Ce programme simule les déplacements d’un aventurier sur une carte textuelle en suivant une suite d'instructions (N, S, E, O).

## ✅ Objectif

- Lire une carte ASCII (`carte.txt`) avec des bois impénétrables (`#`) et des espaces accessibles (` `).
- Lire un fichier de mouvements (`deplacement.txt`) contenant :
  - Ligne 1 : coordonnées de départ `x,y` (coin supérieur gauche = 0,0)
  - Ligne 2 : suite de déplacements (`N`=nord, `S`=sud, `E`=est, `O`=ouest)
- Simuler les déplacements et afficher la position finale.



## ▶️ Compilation & Exécution

### Compilation
```bash
mvn clean install
```

### Exécution
```bash
mvn exec:java -Dexec.args="carte.txt deplacement1.txt"
```

🔁 Exemple avec le deuxième jeu de test :
```bash
mvn exec:java -Dexec.args="carte.txt deplacement2.txt"



