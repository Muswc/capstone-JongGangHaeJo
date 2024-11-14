// noticeRegister.js

// REST API를 이용해 공지사항을 등록하는 함수
async function submitNotice() {
    const formData = new FormData(document.getElementById('register-form'));
    const noticeData = {
        title: formData.get('title'),
        content: formData.get('content')
    };
    try {
        const response = await fetch('http://18.118.128.174:8080/notices', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(noticeData)
        });

        if (response.ok) {
            alert('공지사항이 성공적으로 등록되었습니다.');
            document.getElementById('register-form').reset();
        } else {
            const errorData = await response.json();
            alert(errorData.message || '공지사항 등록에 실패했습니다. 다시 시도해주세요.');
        }
    } catch (error) {
        console.error('공지사항 등록 중 오류 발생:', error);
        alert('오류가 발생했습니다. 나중에 다시 시도해주세요.');
    }
}
