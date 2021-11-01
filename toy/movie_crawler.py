import requests
from bs4 import BeautifulSoup

url = 'http://www.cgv.co.kr/common/showtimes/iframeTheater.aspx?areacode=01&theatercode=0013&date=20211107'
html = requests.get(url)
# print(html.text)

soup = BeautifulSoup(html.text, 'html.parser')
imax = soup.select_one('span.imax')
if(imax):
    imax = imax.find_parent('div', class_='col-times')
    title = imax.select_one('div.info-movie > a > strong').text.strip()
    print(title + ' IMAX 예매가 열렸습니다')
else:
    print('IMAX 예매가 안 열렸습니다.')
