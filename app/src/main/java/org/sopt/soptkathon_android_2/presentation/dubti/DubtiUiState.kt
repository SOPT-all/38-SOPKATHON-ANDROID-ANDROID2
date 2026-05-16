package org.sopt.soptkathon_android_2.presentation.dubti

data class DubtiUiState(
    val pageCount: Int = 1,
    val answer1: String = "",
    val answer2: String = "",
    val answer3: String = "",
    val isLoading: Boolean = false,
) {
    val question = when (pageCount) {
        1 -> "요즘 나에게 집 밖은\n어떤 느낌에 가까워?"
        2 -> "누군가와 연결되는\n첫 단계로 더 편한 건?"
        else -> "지금의 나를\n움직이게 하는 말은?"
    }

    val description = when (pageCount) {
        1 -> "지금 느끼는 그대로 골라주세요. 정답은 없어요:)"
        2 -> "어렵게 느껴져도 괜찮아요. 직감으로 골라주세요."
        else -> "지금 느끼는 그대로 골라주세요. 정답은 없어요:)"
    }

    val aContent = when (pageCount) {
        1 -> "아직은 조금 멀고 부담스러운 곳"
        2 -> "같은 공간에 조용히 있기"
        else -> "“천천히 준비하고 시작해도 돼”"
    }

    val bContent = when (pageCount) {
        1 -> "부담스럽지만 가끔은 궁금한 곳"
        2 -> "짧게라도 한마디 나누기"
        else -> "“딱 5분만 해보고 돌아와도 돼”"
    }
}

sealed interface DubtiUiEffect {
    data object NavigateToDoyeon : DubtiUiEffect
}
