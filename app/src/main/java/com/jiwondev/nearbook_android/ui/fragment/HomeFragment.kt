package com.jiwondev.nearbook_android.ui.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.jiwondev.nearbook_android.R
import com.jiwondev.nearbook_android.databinding.FragmentHomeBinding

const val TAG = "HomeFragment"

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    // 프래그먼트가 액티비티에 붙을 때 호출되고 액티비티와 연결 설정
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach")
    }

    // 프래그 먼트가 생성될 때 호출, 초기화 작업 수행
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
    }

    // 프래그먼트가 최초로 생성될 때 호출되는 메소드. 프래그먼트 뷰 계층 구조(XML 레이아웃)를 생성하고 초기화 한다. 그 이후 반환한다.
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView")
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    // onCreateView 메소드에서 반환한 View 객체가 프래그먼트의 View 계층 구조에 추가된 직후에 호출. -> View가 생성됨을 보장한다.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")
        Toast.makeText(requireContext(), binding.searchBookButton.text.toString(), Toast.LENGTH_SHORT).show()
    }

    // View의 상태를 복원할 때 호출 ex) checkbox의 isChecked
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewStateRestored")
        super.onViewStateRestored(savedInstanceState)
    }

    // 프래그먼트가 화면에 보일 준비가 됐음.
    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    // 프래그먼트가 화면에 포커스를 받음. 사용자와의 상호작용 시작
    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    // 프래그먼트가 일시적으로 화면에서 사라질 때 호출된다. 이 때 프래그먼트는 사용자와의 상호작용을 중지한다.
    override fun onPause() {
        super.onPause()
    }

    // 프래그먼트가 화면에서 완전히 사라질 때 호출.
    override fun onStop() {
        super.onStop()
    }

    // 프래그먼트가 뷰를 제거할 때 호출. 이 때 프래그먼트의 뷰가 제거된다.
    // 하지만 프래그먼트 객체 자체는 사라지지 않고 메모리에 남아있다.
    override fun onDestroyView() {
        Log.d(TAG, "onDestroyView")
        super.onDestroyView()
    }

    // 프래그먼트가 소멸될 때 호출된다. 이 때 프래그먼트가 할당된 메모리가 해제된다.
    // 프래그먼트 객체가 소멸된다.
    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }

    // 프래그먼트가 액티비티와 연결이 끊어질 때 호출된다. 프래그먼트는 액티비티에서 분리된다.
    override fun onDetach() {
        Log.d(TAG, "onDetach")
        super.onDetach()
    }
}