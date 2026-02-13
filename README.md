# Strategy-Design-Pattern

Suppose we have three types of characters in a GameApp.

## Characters

* **Knight:** Attacks with a sword; uses 3 strategies to defend (Shield, Dodge, Magic Barrier)
* **Wizard:** Casts spells; uses Magic Barrier to defend
* **Archer:** Shoots arrows; uses Dodge to defend

## Strategies

* **DefenseStrategy**
  - Shield
  - Dodge
  - CreateMagic

* **AttackStrategy**
  - CastSpell
  - ShootArrow
  - SwingSword
