# ViewPager2 - Swipe

## AndroidX Dependencies
```
// ViewPager
implementation 'androidx.viewpager2:viewpager2:1.1.0-alpha01'

// TabLayout
implementation 'com.google.android.material:material:1.2.0'
```

## Custom Dots

### Tab Selector XML
```
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:drawable="@drawable/tab_indicator_selected"
        android:state_selected="true" />

    <item
        android:drawable="@drawable/tab_indicator_default" />

</selector>
```

### Tab Indicator Selected XML
`<layer-list>` is a drawable object that manages an array of other drawables. Each drawable in the list is drawn in the order of the list—the last drawable in the list is drawn on top.

```
<?xml version="1.0" encoding="utf-8"?>
<layer-list
    xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:left="10dp">

        <shape
            android:innerRadius="0dp"
            android:shape="ring"
            android:thicknessRatio="2"
            android:useLevel="false">

            <solid android:color="@android:color/white" />
            <stroke
                android:width="1dp"
                android:color="@android:color/white" />

        </shape>

    </item>

</layer-list>
```

### Tab Indicator Default XML

```
<?xml version="1.0" encoding="utf-8"?>
<layer-list
    xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:left="10dp">

        <shape
            android:innerRadius="0dp"
            android:shape="ring"
            android:thicknessRatio="2"
            android:useLevel="false">

            <solid android:color="@android:color/transparent" />
            <stroke
                android:width="1dp"
                android:color="@android:color/white" />

        </shape>

    </item>

</layer-list>
```

### Call It on Main Activity XML

```
<com.google.android.material.tabs.TabLayout
        android:id="@+id/tab_dots"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="40dp"
        android:layout_alignParentBottom="true"
        app:tabMode="fixed"
        app:tabGravity="center"
        app:tabBackground="@drawable/tab_selector"
        app:tabIndicatorHeight="0dp" />
```

## Attach TabLayoutMediator to Show the Dots

```
TabLayoutMediator(tab_dots, view_pager, TabLayoutMediator.TabConfigurationStrategy { tab, position ->

    ...
    
}).attach()
```

## App Demo
<img src="https://i.gyazo.com/e446fe41c05fd5b2f1f69774e670db9b.gif" width="350px" height="650px" />
