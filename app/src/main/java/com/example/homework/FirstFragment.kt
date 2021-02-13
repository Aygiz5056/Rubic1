package com.example.homework

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var listOfColors = listOf(
            "#E64A19",
            "#F57C00",
            "#FFA000",
            "#FBC02D",
            "#AFB42B",
            "#689F38",
            "#388E3C",
            "#00796B",
            "#0097A7",
            "#000080",
            "#00008B",
            "            #0000CD",
            "        #0000F F ",
            "#006400",
            "#008000",
            "#008080",
            "#008B8B",
            "#00BFFF",
            "#00CED1",
            "#00F A9A ",
            "#00F F00 ",
            "#00F F7F ",
            "#00F FFF ",
            "#00F FFF ",
            "#191970",
            "#1E90F F ",
            "#20 B2AA ",
            "#228 B22 ",
            "#2E8 B57 ",
            "#2F4F4F",
            "#32 CD32 ",
            "#3 CB371 ",
            "#40E0 D0 ",
            "#4169E1",
            "#4682 B4 ",
            "#483 D8B ",
            "#48 D1CC ",
            "#4 B0082 ",
            "#556 B2F ",
            "        #5F9EA0",
            "        #6495E D ",
            "        #66 CDAA ",
            "        #696969",
            "        #6 A5ACD ",
            "        #6 B8E23 ",
            "        #708090",
            "        #778899",
            "        #7 B68EE ",
            "        #7 CFC00 ",
            "        #7F FF00 ",
            "        #7F FFD4 ",
            "        #800000",
            "        #800080",
            "        #808000",
            "        #808080",
            "        #87 CEEB ",
            "        #87 CEFA ",
            "        #8 A2BE2 ",
            "        #8 B0000 ",
            "        #8 B008B ",
            "        #8 B4513 ",
            "        #8F BC8F ",
            "        #90E E90 ",
            "        #9370 D8 ",
            "        #9400 D3 ",
            "        #98F B98 ",
            "        #9932 CC ",
            "        #9 ACD32 ",
            "        #A0522D",
            "      #A52A2A",
            "        #A9A9A9",
            "        #ADD8E6",
            "        #ADFF2F",
            "        #AFEEEE",
            "        #B0C4DE",
            "        #B0E0E6",
            "        #B22222",
            "        #B8860B",
            "        #BA55D3",
            "        #BC8F8F",
            "        #BDB76B",
            "        #C0C0C0",
            "        #C71585",
            "        #CD5C5C",
            "        #CD853F",
            "        #D2691E",
            "        #D2B48C",
            "        #D3D3D3",
            "        #D87093",
            "#D8BFD8",
            "        #DA70D6",
            "        #DAA520",
            "        #DC143C",
            "        #DCDCDC",
            "        #DDA0DD",
            "        #DEB887",
            "        #E0FFFF",
            "        #E6E6FA",
            "        #E9967A",
            "        #EE82EE",
            "        #EEE8AA",
            "        #F08080",
            "        #F0E68C",
            "        #F0F8FF",
            "        #F0FFF0",
            "        #F0FFFF",
            "        #F4A460",
            "        #F5DEB3",
            "        #F5F5DC",
            "        #F5F5F5",
            "        #F5FFFA",
            "        #F8F8FF",
            "        #FA8072",
            "        #FAEBD7",
            "        #FAF0E6",
            "        #FAFAD2",
            "       #FDF5E6",
            "#FF0000",
            "        #FF00FF",
            "        #FF00FF",
            "        #FF1493",
            "        #FF4500",
            "        #FF6347",
            "        #FF69B4",
            "        #FF7F50",
            "        #FF8C00",
            "        #FFA07A",
            "        #FFA500",
            "        #FFB6C1",
            "#FFC0CB"
        )
        view1.setOnClickListener {
            view1.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view2.setOnClickListener {
            view2.setBackgroundColor(Color.parseColor(listOfColors.random()))
            view3.setOnClickListener {
                view3.setBackgroundColor(Color.parseColor(listOfColors.random()))
            }
            view4.setOnClickListener {
                view4.setBackgroundColor(Color.parseColor(listOfColors.random()))
            }
            view5.setOnClickListener {
                view5.setBackgroundColor(Color.parseColor(listOfColors.random()))
            }
            view6.setOnClickListener {
                view6.setBackgroundColor(Color.parseColor(listOfColors.random()))
            }
            view7.setOnClickListener {
                view7.setBackgroundColor(Color.parseColor(listOfColors.random()))
            }
            view8.setOnClickListener {
                view8.setBackgroundColor(Color.parseColor(listOfColors.random()))
            }
            view9.setOnClickListener {
                view9.setBackgroundColor(Color.parseColor(listOfColors.random()))
            }


        }
    }