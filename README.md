# 🧭 Projet Aventurier

Ce programme simule les déplacements d’un aventurier sur une carte textuelle en suivant une suite d'instructions (N, S, E, O).

## ✅ Objectif

- Lire une carte ASCII (`carte.txt`) avec des bois impénétrables (`#`) et des espaces accessibles (` `).
- Lire un fichier de mouvements (`deplacement.txt`) contenant :
  - Ligne 1 : coordonnées de départ `x,y` (coin supérieur gauche = 0,0)
  - Ligne 2 : suite de déplacements (`N`=nord, `S`=sud, `E`=est, `O`=ouest)
- Simuler les déplacements et afficher la position finale.

## 📁 Structure des fichiers

```
.
├── Aventurier.java
├── carte.txt
├── deplacement1.txt
├── deplacement2.txt
└── README.md
```

## ▶️ Compilation & Exécution

### Compilation
```bash
javac Aventurier.java
```

### Exécution
```bash
java Aventurier carte.txt deplacement1.txt
```

🔁 Exemple avec le deuxième jeu de test :
```bash
java Aventurier carte.txt deplacement2.txt
```

## 📌 Exemple de fichier `deplacement1.txt`

```
3,0
SSSSEEEEEENN
```

### Résultat attendu
```
Position finale : (9,2)
```

## 🗺️ Légende de la carte

- `#` : bois impénétrables (obstacles)
- ` ` : case vide, accessible

## 👤 Auteur

Réalisé dans le cadre de l'exercice "Sujet Aventurier".
