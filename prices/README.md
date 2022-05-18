# Price component

## Price design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you can use the `Vitamin*Price` component.

```kotlin
implementation("com.decathlon.vitamin:prices:<version>")
```

```xml
<com.decathlon.vitamin.prices.VitaminPriceDefaultSmall 
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" 
    android:text="150 €" />
```

With the same usage as above, you have multiple price types available:

| Button type             | Kotlin Class                         | Attribute style                         |
|-------------------------|--------------------------------------|-----------------------------------------|
| Default Small           | `VitaminPriceDefaultSmall`           | `?attr/vtmnPriceDefaultSmall`           |
| Default Medium          | `VitaminPriceDefaultMedium`          | `?attr/vtmnPriceDefaultMedium`          |
| Default Large           | `VitaminPriceDefaultLarge`           | `?attr/vtmnPriceDefaultLarge`           |
| Accent Small            | `VitaminPriceAccentSmall`            | `?attr/vtmnPriceAccentSmall`            |
| Accent Medium           | `VitaminPriceAccentMedium`           | `?attr/vtmnPriceAccentMedium`           |
| Accent Large            | `VitaminPriceAccentLarge`            | `?attr/vtmnPriceAccentLarge`            |
| Alert Small             | `VitaminPriceAlertSmall`             | `?attr/vtmnPriceAlertSmall`             |
| Alert Medium            | `VitaminPriceAlertMedium`            | `?attr/vtmnPriceAlertMedium`            |
| Alert Large             | `VitaminPriceAlertLarge`             | `?attr/vtmnPriceAlertLarge`             |
| Strikethrough Small     | `VitaminPriceStrikethroughSmall`     | `?attr/vtmnPriceStrikethroughSmall`     |
| Strikethrough Medium    | `VitaminPriceStrikethroughMedium`    | `?attr/vtmnPriceStrikethroughMedium`    |
| Strikethrough Large     | `VitaminPriceStrikethroughLarge`     | `?attr/vtmnPriceStrikethroughLarge`     |

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire
app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin
price styles. You can now use the price component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:prices:<version>")
```

```xml

<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <!-- Vitamin Prices -->
        <item name="vtmnPriceDefaultSmall">@style/Widget.Vitamin.Price.Default.Small</item>
        <item name="vtmnPriceDefaultMedium">@style/Widget.Vitamin.Price.Default.Medium</item>
        <item name="vtmnPriceDefaultLarge">@style/Widget.Vitamin.Price.Default.Large</item>
        <item name="vtmnPriceAccentSmall">@style/Widget.Vitamin.Price.Accent.Small</item>
        <item name="vtmnPriceAccentMedium">@style/Widget.Vitamin.Price.Accent.Medium</item>
        <item name="vtmnPriceAccentLarge">@style/Widget.Vitamin.Price.Accent.Large</item>
        <item name="vtmnPriceAlertSmall">@style/Widget.Vitamin.Price.Alert.Small</item>
        <item name="vtmnPriceAlertMedium">@style/Widget.Vitamin.Price.Alert.Medium</item>
        <item name="vtmnPriceAlertLarge">@style/Widget.Vitamin.Price.Alert.Large</item>
        <item name="vtmnPriceStrikethroughSmall">@style/Widget.Vitamin.Price.Strikethrough.Small</item>
        <item name="vtmnPriceStrikethroughMedium">@style/Widget.Vitamin.Price.Strikethrough.Medium</item>
        <item name="vtmnPriceStrikethroughLarge">@style/Widget.Vitamin.Price.Strikethrough.Large</item>
    </style>
</resources>
```

```xml

<com.decathlon.vitamin.prices.VitaminPriceDefaultSmall
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="150 €" />
```

### Version 2

You can also inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:prices:<version>")
```

```xml

<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml

<com.google.android.material.textview.MaterialTextView
    style="@style/Widget.Vitamin.Price.Default.Small" 
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" 
    android:text="150 €" />
```

### Version 3

If you don't want to use Vitamin colors and font on all your app, you can directly use the Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin">
    
    <com.decathlon.vitamin.prices.VitaminPriceDefaultSmall
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="150 €" />
    
</androidx.constraintlayout.widget.ConstraintLayout>
```
