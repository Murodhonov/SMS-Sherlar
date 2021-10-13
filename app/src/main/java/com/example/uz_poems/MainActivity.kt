package com.example.uz_poems

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.uz_poems.Cache.Cache
import com.example.uz_poems.Cache.Cache.array1List
import com.example.uz_poems.Cache.Cache.array2List
import com.example.uz_poems.Cache.Cache.array3List
import com.example.uz_poems.Cache.Cache.array4List
import com.example.uz_poems.Cache.Cache.array5List
import com.example.uz_poems.Cache.Cache.array6List
import com.example.uz_poems.Cache.Data
import com.example.uz_poems.Cache.Data.begin
import com.example.uz_poems.Cache.Data.isFirst
import com.example.uz_poems.Cache.Data.myList
import com.example.uz_poems.Modles.MyClass
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.alert_dialog.view.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

  override fun onBackPressed() {
    if (Data.iExit){
      val a = BottomSheetDialog(this,R.style.SheetDialog)

      a.setCancelable(true)

      val item = LayoutInflater.from(this).inflate(R.layout.alert_dialog,null,false)

      a.setContentView(item)

      item.yoq.setOnClickListener {
        a.hide()
      }
      item.ha.setOnClickListener {
        finish()
      }

      a.show()

    }else{
      findNavController(R.id.my_host).popBackStack()
    }
  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      Cache.init(this)


         if(array1List.isEmpty() && array2List.isEmpty() && array3List.isEmpty() && array4List.isEmpty() && array5List.isEmpty() && array6List.isEmpty()){

           val poemLove = ArrayList<MyClass>()
           val poemMiss = ArrayList<MyClass>()
           val poemTabrik = ArrayList<MyClass>()
           val poemParent = ArrayList<MyClass>()
           val poemFriend = ArrayList<MyClass>()
           val poemJokes = ArrayList<MyClass>()

           poemLove.add(MyClass(false,0,"Saodat so'qmog'in izlayin uzoq","Saodat so'qmog'in izlayin uzoq, Sen baxting yo'lidan toymasang bo'ldi. Menga ko'p ko'rindi sevgidan qiynoq, Sen ishqning sururin qo'ymasang bo'ldi. Ko'zingga boqqanda ko'zlarim kulsa, Yurak diydoringdan" +
                   " sevinib ursa, Sevinching chehramdan akslanib tursa, Meni baxtli deya o'ylasang bo'ldi. Sarhadlardan qo'rqib yashasam nima? Faqat g'amdan luqma oshasam nima? Dunyoga dardimni to'shasam nima? Sen faqat quvonchdan so'ylasang bo'ldi. Bahorim ortidan ergashganda kuz, Kuzning so'zlariga" +
                   " berkinsa afsus, Sevgim yuragimga qilsa tajovuz, Sen meni do'stlik deb siylasang bo'ldi. Bulutlar ortiga berkinsa oftob, Bugun salqin deya  o'ylasang bo'ldi. Yuzimga do'stlikdan ilingan niqob, Ashaddiy yurakni ko'rmasang bo'ldi"))
           poemLove.add(MyClass(false,0,"Uyingizga yetib bormasin xatlar","Uyingizga yetib bormasin xatlar, Yomg'irlar chertmasin derazangizni. Sizga hamrox bo'lsin eng ulkan dardlar, Eng kichik dardlar ham qiynasin sizni. Bo'm-bo'sh xona sizni ishga kuzatsin, Yolg'iz " +
                   "surat suhbat qursin siz bilan. Tunda to'shagingiz zulmat tuzatsin, Olov bilan yashamang, yashang muz bilan. Omadli yo'llarning tizini tashlang, Omadsiz yo'llardan yuring qoqilib. Meni sog'inguncha siz shunday yashang, Men shunday yashadim sizni sog'inib!"))
           poemLove.add(MyClass(false,0,"Eh ko'zimga to'ldi yosh","Eh ko'zimga to'ldi yosh, Yig'lolmasam netayin? Visolingga qalamqosh, Yetolmasam netayin? Shuncha sevib bir seni, Aytolmadim netayin? Bugun ko'zda yoshingni, Artolmadim netayin? Ko'zlarimga boqolmay, Deding " +
                   "to'yim bo'lyabdi, Otam meni eshitmay, Bir yigitga beryabdi. Qanidi kar bo'lib qolsam, So'zlaringni eshitmay qolsam, Eh qanidi mening jonginam, Shu so'zlarin eshitmay o'lsam!"))
           poemLove.add(MyClass(false,0,"Ammo afsus netayin","Ammo afsus netayin, Bari azal taqdir ekan, Faqatgina Allohim, Barchaishga qodir ekan! Sen deb yashab dunyoda Yetishganim alam bo'ldi Zor qalbimni qon yig'latib, Shu alamni ko'ngli to'ldi, O'ylab qoldim ne qilay?" +
                   " Ko'zda yoshing artaymi? Yo yurakdan sevganim, Sen ekaning aytaymi? Yoki sendan voz kechib, Bu shashdimdan qaytaymi? Shu ko'changdan bir ketib, Qaytmas bo'lib ketaymi? Savollarga ko'milgan, Yurak bag'rim yig'laydi, Ko'z yosh to'kib yig'lardimu, Ammo to'g'ri kelmaydi. Ko'z" +
                   " yoshlaring artaman, Artmasam ham bo'lmaydi! Chin sevgimni aytaman, Yo'qsa ko'nglim to'lmaydi"))
           poemLove.add(MyClass(false,0,"Har tunda yulduzli samoga qarab","Har tunda yulduzli samoga qarab, Xudodan so'rayman sabr va to'zim. Aldandim, yolg'onchi dunyoda yashab, Yolg'onchi ko'zlarga tushmasin ko'zim. «Men seni yurakdan sevaman, degan Yorimda azal vafo yo'q" +
                   " ekan. Ko'nglimni olganu qaytib bermagan Yolg'onchi ko'zlarga tushmasin ko'zim. Titranar, alamdan ingrar yuragim, Ayriliq kuyini tinglar yuragim. Xudodan tilagan yolg'iz tilagim Yolg'onchi ko'zlarga tushmasin ko'zim. Yo'q ekan dunyoda sevgi, muhabbat, Sadoqat topilmas, ko'pdir" +
                   " xiyonat. Mayli toq o'tayin dunyodan faqat, Yolg'onchi ko'zlarga tushmasin ko'zim. Yolg'onchi yorimga tushmasin ko'zim!"))
           poemLove.add(MyClass(false,0,"Manzillar olis","Manzillar olis, olis osmonlar Qorong'u tun bag'rida yashirin yulduzlar Tinmay tomchilar samo yoshlari, Shu yomg'irga jo'r bo'lar qalb faryodlari. Qo'ling silkitib ketding egib bosh, Aldangan sevging deb to'kib sen" +
                   " ko'z yosh. Sevging yakson bo'lib toptalgan mahal, Qo'ling silkab yana beryapsan bardosh!"))
           poemLove.add(MyClass(false,0,"Ayt","Ayt, umringni oldingmi qarzga? Yo toptalish uchunmi yaraldi sevging. Ayt, sevgingni sotgan birovga, Yana qancha bardosh bersin yuraging? To'rt devoring yopiq, ko'rinmas quyosh Bu damda topilmay ketti bir sirdosh. Xasrat-alaming-u," +
                   " ko'z yoshing qoldi, Sevging qudrati jim yakson bo'ldi. Birovlar kuldilar, qo'shilding sen ham Masxara qildilar, indamading ham Sevging faryod solib qon yig'laganda O'zgalarga qo'shilib jim turding sen ham Mana endi nega kech bo'lganida Tangriga tavba qilib nola qilyapsan."))
           poemLove.add(MyClass(false,0,"Ravo ko'rganda","U go'zal tuyg'uni ravo ko'rganda Zor yig'latib,lek nega yana kutyapsan? Izla agar topa olsang armonlaringdan, Yeta olsang agar samolaringdan. Izla agar sabab bo'lsa voz kechganingga Topolmasang izlab ko'rgin gunohlaringdan. " +
                   "Balki emassan gunohkor-aybdor Ammo sening aybing qildi uni xor Balki sham yoqqandi shu bir gunohkor Lek shu gunohkor deb, sensan aybdor Yetganlar bor, yetmaganlar ko'p Har kimgamas berilgan imkon Sen qodir eding sevishga ammo Xiyonating tufayli afsus u sarson"))
           poemLove.add(MyClass(false,0,"MEN YASHARDIM SEN UCHUN","MEN YASHARDIM SEN UCHUN SENCHI SEN KIM UCHUN MEN YOZARDIM SHERLAR SEN UCHUN SENCHI SEN KIM UCHUN SEN BILARMIDING SEVGIM SEN ESLARMIDING KUYGANIM SEN UNUTMADINGMI SODIQLIGIM SEN O'YLARMIDING YONGANIM BOSHLARMAN SHUNDAY " +
                   "DEB YANA SHERLARIM MISRALARIN BU KIM UCHUNDIR KULGULI KIM UCHUNDIR ESA QAYG'ULI LEKIN BU KULGILIMAS BALKI QAYG'ULI HAM EMAS BU YANA VA YANA O'SHA SIZ ESLAYDIGAN MUHABBAT HAQIDA HA BU O'SHA HAYAJONLI ONLAR HA BU O'SHA AJOYIB TUYG'U HA BU O'SHA BEMISIL HISSIYOT HA BU O'SHA MUHABBAT!"))
           poemLove.add(MyClass(false,0,"Qiynading sevaman deb sen meni qiynading","Qiynading sevaman deb sen meni qiynading, Tashlab ketib yuragimni tirnading. Ko'zlaringda sen meni ko'rmading, Haqiqiy muhabbatim nahot bilmading. Kuydi dilim bilmay turib suydi dilim, Bugun esa" +
                   " tashlab ketdi aldab turib. Yig'lagandim ko'zimdagi yoshim ko'rib, O'zgani sevdi men yonida turib. Meni sevib nega hiyonat qiladi? Uni uni jondan sevishimni bilardi. Nega doim meni ustimdan kulardi, Undan boshqani sevmasligimni bilardi. Oxirgi so'zlari juda ham kulguli, Lekin men uchun u juda ham " +
                   "qayg'uli. Bo'ldi sizni sevgiz man uchun bir tiyin, Men bugun sizdan boshqani topdim. Siz bilan bo'lgan sevgi kitobini yopdim, Nima qilishni ham bilmay qoldim!"))
           poemLove.add(MyClass(false,0,"Yurak yig'lar hali ham tinmay","Yurak yig'lar hali ham tinmay, Tashlab ketdi u buni bilmay. Shu ko'zlari ichida meni ko'rmay, Sevaveraman sevgim bor mangu. Lekin bu sevgini oxiri doim qayg'u Kimligini o'zi ham bilmaydi Kimni sevib kimlar bilan " +
                   "yurmaydi. Qo'lidan o'zi hech bir ish kelmaydi Sevaveraman sevgim bor mangu! Lekin bu sevgini oxiri doim qayg'u, Yurak yig'laydi unga ming qayg'u Sevaveraman men aldasa ham mayli! Lekin sevgi bilan doim birga yurar ekan qayg'u Sevaveraman sevgim bor mangu! Lekin bu sevgini oxiri doim qayg'u, " +
                   "So'zlarida rost bo'lmagan bilaman. Sevmasa ham baribir uni sevaman, Tushimda har kun o'zga bilan ko'raman, Sevaveraman sevgim bor mangu! Lekin bu sevgini oxiri doim qayg'u Telefonda gaplashardik biz har tun uzoq. Uni sevgisi men uchun chiqib bo'lmas tuzoq. U yonimda emas oramiz endi juda yiroq, " +
                   "Sevaveraman sevgim bor mangu! Lekin bu sevgini oxiri doim qayg'u!!! Sevmasliginiku doim men bilganman, Qanchalar bilan yurib sevgini o'yin qilganda Meni eslaydi bir kun sevgisiz qolganda, Sevaveraman sevgim bor mangu! Bir kun ushaladi bugun ushalmagan tuyg'u!!!"))

           poemMiss.add(MyClass(false,1,"Ko`z yosh to`kar kun kelib Aldanganin sezib turib","Ko`z yosh to`kar kun kelib Aldanganin sezib turib. Faryod chekar har tun turib Sevganlarga achinaman. Sevmasdan yashash mumkinu Sevgisiz hayot erkinu. " +
                  "Daryoday ko`z yoshing oqmas. Seni esa darding ko`pmas Tunda eslab yotmaydi. Bir umr u kutmaydi. Sevishda davom etmaydi Sevganlarga achinaman. Yuragidan to`lib toshib Oldiga bormaydi u shoshib Tog`u toshlardan u oshib. Yig`lamaydi ko`ngli toshib Yillar " +
                  "o`tib esga tushmas Dardlaring qaytda qo`zg`amas. Tashlab ketganing eslamas Sevganlarga achinaman. Sevish nedur qanday tuyg`u. Berar edim shu savolni. Sevish shartmi tashlab ketsa Yuragingiz kovlab ketsa. Sevsin sevgini bilganlar Uni qadriga yetganlar Unutmay mangu sevganlar. " +
                  "Shirin Tuyg`uni bilganlar. Sevib doim yig`lamasin Sevganini izlamasin. Tashlab ketsa sevgi zahar Sevganlarga achinaman!"))
           poemMiss.add(MyClass(false,1,"Yagonam qalbimga solib ko`r quloq","Yagonam qalbimga solib ko`r quloq Qalbim so`z aytolmay yig`laydiku jim. Yuragim g`amdadir ko`zlarim quvnoq Bunchalar hayratli sevaman demoq Birgina shu so`zni sen uchun aytmoq."))
           poemMiss.add(MyClass(false,1,"Ko`klarda oyning bor quyoshi","Ko`klarda oyning bor quyoshi, Xar narsaning bor jufti umr yo`ldoshi, Hayotda baxtim to`kis butun, Chunki Sen borsan Men uchun."))
           poemMiss.add(MyClass(false,1,"Yo`q seni unutmoq emasdur onson","Yo`q seni unutmoq emasdur onson, Qalbimni o`rtaydi hali ham hijron. Yurakda bir tuyg`u uradi hamon, Men seni sevardim, sevaman HAMON."))
           poemMiss.add(MyClass(false,1,"Ismiz qo`yaman","Agar o`lmasam ayanchlar ila To`yimga sizni taklif qilaman Bir umirga unutmay sizni Men o`g`limga ismiz qo`yaman."))
           poemMiss.add(MyClass(false,1,"Ko`zim kulib turar","Ko`zim kulib turar,Yig`laydi qalbim Muhabbat yo`liga sig`maydi dilim Ishq degan bir balo tirnaydi qalbim Ne qilay sevgilim seni sog`indim."))
           poemMiss.add(MyClass(false,1,"KETDING TINGLAMASDAN SO`ZLARIM","KETDING TINGLAMASDAN SO`ZLARIM ARMON BO`LDI YOSHLIK YILLARIM SEVAMAN DEB ISHONTIRGANDING ACHCHIQ YOSHGA TO`LDI KO`ZLARIM!"))
           poemMiss.add(MyClass(false,1,"Goxida qalbingni asir etsa g`am","Goxida qalbingni asir etsa g`am, Xayolingni chulgasa nogox bir alam Sevganing o`zgani tanlab ketsa ham Mendek do`sting borligin unitma hech xam!\n"))
           poemMiss.add(MyClass(false,1,"Hijron","Hijron - har kungi yemish Quvonch - Unutilgan so`z. Baxt - ko`rinmas cho`qqi. Sevgi - nimaligin hech kim bilmaydi."))
           poemMiss.add(MyClass(false,1,"Sizni haftada bir bo`lsa ham","Sizni haftada bir bo`lsa ham; Tinglasam so`zingiz u tarona, Sizga o`zim bir kalom aytsam u So`ng bu o`yga ming bora qaytsam Tun-u kun, uchrashguncha yana." +
                   " Ammo odamovi emishsiz, Sizni zeriktirganmish qishloq, Biz-chi?... biz o`zgachamas, Biroq Siz doim bizga sevinishsiz. Nega keldingiz bizlar tomon? Unutilgan olis sarobda Sizni bilmasdim men hech qachon, Qolmas edim o`tli azobda. Titroq tursa bu bebosh qalbda," +
                   " (Balki) uni avrab olardim, Topib o`zga dilkash vafodor, Bo`lar edim sadoqatli yor Ham mehribon ona bo`lardim."))

           poemTabrik.add(MyClass(false,2,"Bahor ko`rkamligi","Bahor ko`rkamligi, subxidam tongi, Beg`ubor qalbingiz hamrohi bo`lsin! Quvonchlar tilayman yangidan-yangi, Dilingiz shodlikka, orzuga to`lsin!!!"))
           poemTabrik.add(MyClass(false,2,"Ko`zgamas bu qalbimga boq","Ko`zgamas bu qalbimga boq, Meni ado etmoqda firoq, Javobingdan qalbimda titroq, Hor ishqimni qabul et faqat! Sevganim chin hech xato emas," +
                   " O`jar yurak o`zgani demas, Ishon aldash qo`limdan kelmas, Hor ishqimni qabul et faqat! Rahm et, Qolmay aqldan ozib, Ishqqa armon qabrimni qazib, Tiz cho`kaman, Ishnoma yozib, Hor ishqimni qabul et faqat! Yosh " +
                   "bo`layin ko`zlaringda bas! Yuzlaringda yashayin bir pas, Lablaringda jon beray besas... Hor ishqimni qabul et faqat!"))
           poemTabrik.add(MyClass(false,2,"Dunyoda bayramlar to`lib yotibdi","Dunyoda bayramlar to`lib yotibdi, Ularning asli cho`pchak yo ertak. Bugun hatto quyosh go`zal otibdi Hayit bayramingiz bo`lsin muborak! Gullar bilan to`lib toshganda saxro," +
                   " Cho`lda gullagan eng go`zal chechak Iymon lazzatidan olingiz bahra Hayit bayramingiz bo`lsin muborak! Shafaqning qo`yniga yashiringan oq Go`zal tong otdi deb bergandek darak Buyuk e`tiqodni ramzi o`laroq Hayit bayramingiz bo`lsin muborak! Dunyoda muhabbatin" +
                   " o`ziga jo aylagan Oyning yuzin yopar ehtimol etak Rasululloh sevib bayram aylagan Hayit bayramingiz bo`lsin muborak! Kufru, shirk, ma`siyat, bo`xtonu g`iybat Islomsiz yo`lkaga sochganda pechak Mo`min birodarim tilagim faqat Hayit bayramingiz bo`lsin muborak!"))
           poemTabrik.add(MyClass(false,2,"Bugun hamma narsa odatdagidek","Bugun hamma narsa odatdagidek, Senga baxt tilashar qilishar o`git, Bugun men ham senga bir niyat qilay. Posbon bo`la qolsin senga shu yigit. Yomg`irlar tinmasa mayli ho`l bo`lgin, Mevasi " +
                   "ser hosil baxti mo`l bo`lgin, Bog`bon bo`la qolsin senga shu yigit. ollohim baxt etmish senga hush chiroy, boshinga qo`ngani rost bo`lsin humoy, o`zingsan uzoqni ko`zlagan karvon, Bo`g`bon bo`laqolsin senga shu yigit."))
           poemTabrik.add(MyClass(false,2,"Oq libosga burkangan kelinchak","Oq libosga burkangan kelinchak, er yigitga bog`langan kelinchak, necha yilu necha asrdan buyon afsonaga aylanangan kelinchak. Bugun seni tillodan ostona kutar, ostonada turib QAYNONA kutar," +
                   " o`zinga munosib yorni topibsan, xusninga yarashgan parvona kutar. oyoq ostiga boq osmonga boqma, mehr o`tini yoq, g`azabga boqma, Salomni bir umr sen kanda qilma, Aziz QAYNONAngni sharmanda qilma, Aziz QAYNONAngni duosini ol. Bir umr baxtli kelin bo`lib qol"))
           poemTabrik.add(MyClass(false,2,"Keldi mana yangi yil","Keldi mana yangi yil. Ulashib kimgadur quvonch, kimgadur esa o`tkan yilning achchiq damlarini eslatib. Kimningdir kelgan yildan umidi katta. Zero avvalgi yillarda yetishmagan orzulariga ushbu yilda " +
                   "erishishiga umidvor. Yana kimdur kirib kelgan yilda o`tmish hatolarini takrorlamasligini tilkadoshi. Yangi yilda kimdur o`z yuragining yarmi bilan baxtli oila qurish orzusida... Nima bo`lishidan qat`iy nazar. Kirib kelgan yilda baxt hamisha hamrohingiz bo`lsin!"))
           poemTabrik.add(MyClass(false,2,"8 - mart bugun.","8 - mart bugun. Onajonlar bayrami. Yo`llariga poyandoz. Dasta gullar boylami."))
           poemTabrik.add(MyClass(false,2,"Qalbni nurga to`ldirgan iymon oyi muborak.","Qalbni nurga to`ldirgan iymon oyi muborak. Jannat yo`lin ko`rsatgan Qur`on oyi muborak. Ko`kdan tushgan malaklar fayzli onlar muborak. Ro`zadorga mukofot savob oyi muborak. " +
                   "Assalomu aleykum.Ramazon oyi muborak bo`lsin. Xammamizga baxt va omad olib kelsin.Gunohlarimizni Alloxim maxfirat aylasin."))
           poemTabrik.add(MyClass(false,2,"Eshit do`stim","Eshit do`stim, sen bu kun yomonlikdan qayt, Undan ko`ra savob qil, yaxshi so`zlar ayt, Men xam seni tabriklay shunday ulug` payt, Chunki bugun qutlug` bayram QURBON Hayit!"))
           poemTabrik.add(MyClass(false,2,"Bahor ko`rkamligi","Bahor ko`rkamligi, subxidam tongi, Beg`ubor qalbingiz hamrohi bo`lsin! Quvonchlar tilayman yangidan-yangi, Dilingiz shodlikka, orzuga to`lsin!!!"))
           poemTabrik.add(MyClass(false,2,"Sokin tunda bezota qilib,","Sokin tunda bezota qilib, Eng so`nggilar safida bo`lib. So`zlarimni guldasta bilib, Deyman Tug`ilgan kuningiz bilan!"))

           poemParent.add(MyClass(false,3,"Sen ona","Алишерга алла айтиб ухлатган\nСен — она.\nОғушида Бобур камолга етган\nСен — она.\nТоробийни оғир жангга жўнатган\nСен — она.\nОламни нурида мунаввар этган\nСен — она.\nЙиғласа, дунёни расо титратган\nСен — она.\nКулгиси саодат парвариш этган\nСен — она.\nДаҳолар бешигин бедор тебратган\nСен — она.\nМеҳри баҳорида элни яшнатган\nСен — она.\nЯгона ўғлингни жўнатдинг жангга,\nБўл бардам, она!\nОнадай ошиқ йўқ она Ватанга,\nМуҳтарам она…\n"))
           poemParent.add(MyClass(false,3,"Кўз очиб оламга келгандан бери","Кўз очиб оламга келгандан бери\nНеларни кўрмади бу бошим менинг.\nОзми-кўп танидим ҳаётнинг сирин,\nҚирққа ҳам етибди бу ёшим менинг.\n\nЙилдан-йил орттирдим талай дўсту ёр,\nҲурматлаб дедилар, «дўстим», «ўртоғим»,\nУлғайдим: кўксимга бош қўйиб дилдор,\nУ деди: «Бахтимсан, суянган тоғим!..»\n\nО, она, ҳеч бири эмасдур ширин\n«Болам!» деб бир оғиз айтган сўзингдан!\nО, она меҳрингда қуёш яширин,\nНе ажаб гул унса ҳар бир изингда!"))
           poemParent.add(MyClass(false,3,"","Муштипар ҳам ўзинг, буюк ҳам ўзинг,\nКуйинчак ҳам ўзинг, куюк ҳам ўзинг.\nОламга татирлик суюк ҳам ўзинг,\nПайт келди айтмоққа, гапнинг хонаси,\nЭй, Ўзбек онаси, Ўзбек онаси.\n\nСени Тўмарис деб, мақтаганим бор,\nСен Темур бешигин тебратган бедор,\nСенсан Бибихоним, Нодираи зор,\nПайти келди айтмоққа, гапнинг хонаси,\nЭй, Ўзбек онаси, Ўзбек онаси.\n\nВатанни Она деб бекор айтилмас,\nОна буюрганда йўлдан қайтилмас,\nСен ўзинг Каъбамсан, Байтул муқаддас,\nПайт келди айтмоққа, " +
                   "гапнинг хонаси,\nЭй, Ўзбек онаси, Ўзбек онаси.\n\nБошингдан нималар ўтмади ахир,\nВатандек тақдиринг бўлди гоҳ тахир,\nБобур шоҳ бўлсада, қошингда фақир,\nПайт келди айтмоққа, гапнинг хонаси,\nЭй, Ўзбек онаси, Ўзбек онаси.\n\nГоҳида балқидинг Барчиндек тўлиб,\nҒўзадек қуридинг Турсуной бўлиб,\nТимсолинг яловда юлдуздек кулиб,\nПайт келди айтмоққа, гапнинг хонаси,\nЭй, Ўзбек онаси, Ўзбек онаси.\n\nФарзандинг қувонса — сен ҳам қувондинг,\nФақат болам дединг, яшадинг, ёндинг,\nНокаси учраса, ўртандинг, тондинг,\nПайт кеди айтмоққа, " +
                   "гапнинг хонаси,\nЭй, Ўзбек онаси, Ўзбек онаси.\n\nКелажак тойчоғу тойингиздадир,\nЖаннат ҳам, албатта, пойингиздадир,\nВатан-ку Сиз турган жойингиздадир,\nПайт келди, айтмоққа, гапнинг хонаси,\nЭй, Ўзбек онаси, Ўзбек онаси.\n\nСизга таъзим қилиб турибман бу пайт,\nСизга бахшидадир энг шоҳона байт,\nАзиз элу юртга дуоларинг айт,\nПайт келди айтмоққа, гапнинг хонаси,\nЭй, Ўзбек онаси, Ўзбек онаси."))
           poemParent.add(MyClass(false,3,"Юлдузлардан сирқилиб шабнам","Юлдузлардан сирқилиб шабнам,\nУфқ билан кўришганда ер,\nОфтобга кипригим билан\nОна сўзни ёздим гўё шеър.\nАму оқар мисоли булут,\nУфқ бўлиб оқади Аму,\nҚирғоғини этса ҳам унут,\nМайсаларни унутмайди у!\nҲар кўкат, ҳар баргнинг номига\nУ элтади тоғлардан таъзим,\nОна деган сўзнинг ёнига\nЧизгим келди МАЙСАнинг расмин.\nКапалак ранг, булбуллар оҳанг\nКашфи билан маст бўлган лаҳза,\nОна сўзин қаватига ман\nЁзиб қўйдим БАҲОР деб аста…\nМен жо этдим Она номига\nЕрни сўнгги гардигача то." +
                   "\nЭнди Она сўзи ёнига\nДадил ёзиб қўяман: ДУНЁ!\nМен юлдуз деб уни куйлайман,\nУ Ватандир,\nУ Арши аъло.\nМен унга минг ташбеҳ ўйлайман,\nЕтказурман миллионга ҳатто…"))
           poemParent.add(MyClass(false,3,"Онажоним","Онажоним, кўзларингизда\nКуннинг нафаслари бор эди,\nОнажоним, юзларингизга\nОйнинг ҳаваслари бор эди.\nОнажоним, сиз билан жаҳон\nБеҳигулдай ифорли эди.\nТунлар ойдин, кунлар шодмон,\nШабадалар дуторли эди.\nТушларимга кириб чиқасиз\nСочларимни ўриб чиқасиз.\nФариштадай бошим узра гоҳ\nОромимни кўриб чиқасиз.\nТалпинаман, қучсайдим қани?\nСоғинчлардан қочсайдим қани?\nКўз ёшларим гулга айланса,\nПойингизга сочсайдим қани?\nОнажоним! Жонажоним!"))
           poemParent.add(MyClass(false,3,"Сочларимда оқ гуллар","Сочларимда оқ гуллар,\nКел, уларни тер, болам.\nЙўлингга муштоғ йўллар,\nБолам бўлиб бер, болам.\nКўксимга ой беркитдим,\nЮлдузларга чой тутдим,\nОтангдан ҳам кўп кутдим,\nБахтим бўлиб бер, болам.\nТитраган созингни қўй,\nБўғиқ овозингни қўй,\nҚалам-қоғозингни қўй,\nЎғлим бўлиб бер, болам.\nЙўл учун туққанмидим,\nГул учун туққанмидим,\nПул учун туққанмидим,\nБорим бўлиб бер, болам.\nҚалдирғоч синглинг беҳол,\nҚанотидан хатни ол.\nИшинг кўпдир, эҳтимол,\nКелмай қўявер, болам…"))
           poemParent.add(MyClass(false,3,"SЕNI KO‘RGIM KЕLAR, ONAJON","SЕNI KO‘RGIM KЕLAR, ONAJON\nShodlikdan osmonga yetganda boshim\nBir joyga to‘plansa do‘stu qarindoshim.\nYo boshimga tushsa biror musibat,\nYoki birov aytsa otamga rahmat.\nUchrab qolsa yo‘lda tanish ayollar,\nDildan tilga ko‘chsa ma’sum xayollar"))

           poemFriend.add(MyClass(false,4,"Do`st dedimu sevgim menga begona bo`ldi","Do`st dedimu sevgim menga begona bo`ldi, Nish urdiyu, muxabbatim ochilmay so`ldi, Visol emas, uqubatga paymonam to`ldi. Meni emas, o`z-o`zingni aldading go`zal. Samimiy salomim yo`lladim bugun, Ko`rishmay qo`ydik bizlar ne uchun? Agar qo`yar bo`lsak vaqtni biz ustun, Oqibat yo`qolib ketishi mumkin."))
           poemFriend.add(MyClass(false,4,"Agar bir inson senga bildirdi ishonch","Agar bir inson senga bildirdi ishonch, Yoningda bo`ldi senga kelganda qayg`uyu quvonch, Kutmadi sendan boylik- taxt,tilasa sog`liq baxt. Seni aldamas qilmas hiyonat,g`iybat, Yoningda bo`ldi qilsalar tuhmat. Bermadi zarra dilingga ozor, Doim kutdi bo`lib ko`zlari humor, Demak, bu hislatni barisin bilgan do`st! Bilamagan esa shubhasiz dushman, Desa hamki men senga DO`STMAN!"))
           poemFriend.add(MyClass(false,4,"Mani do`stim oyga o`xshiydi","Mani do`stim oyga o`xshiydi, Bir to`lib chiqadiyu keyin yo` bo`p ketadi Mani do`stim quyoshga o`xshiydi, Yarim kunni yoritib, keyin sog`intirib ketadi, Mani do`stim yulduzlarga o`xshiydi Osmonlarni yashnatib, barchaga quvonch baxsh etadi " + "Mani do`stim osmonga o`xshiydi Keng bag`ridan hammaga joy beradi.."))
           poemFriend.add(MyClass(false,4,"Do`stlarim sizlarga aytar gapim bor","Do`stlarim sizlarga aytar gapim bor, eshitim bu so`zni juda ko`p darkor zamon keldi do`stlar bir ajib zamon ko`paydi juda ko`p insoni yomon, musulmonman deydiyu namoz bilmaydi o`zidan kattani pisand qilmaydi qizlar yigitlardan soat so`rasa yigitlar ulardan narxin" +
                   " so`raydi qizlarning kiyimi avrat berkitmas yigitlar yuradi asli yigitmas juda ham ko`paydi o`grilik nas qalloplar o`grilar bir-biridan pas bu zamon o`tkinchi OXIRAT YAQIN.."))
           poemFriend.add(MyClass(false,4,"Hamma go`zallar ham emas bevafo","Hamma go`zallar ham emas bevafo - Barcha bevafolar gozaldir l-n - Sizdek bir gozalga bolmasmi jazo - Mayliga kumdan kun chiroy och - Quyoshdanda porloq, oppoq yuzingiz - Asaldan shirindir," +
                   " zaxar sozingiz - Osmondagi charaqlagan, zuxro ozingiz - Xar narsani koraverib, pishgan kozingiz.- Hamma gozallar ham emas bevafo - Barcha bevafolar gozaldir l-n - Sizdek bir gozalga bolmasmi jazo - Mayliga kumdan kun chiroy och - Quyoshdanda porloq, oppoq yuzingiz - Asaldan shirindir, zaxar sozingiz - Osmondagi charaqlagan, zuxro ozingiz - Xar narsani koraverib, pishgan kozingiz."))
           poemFriend.add(MyClass(false,4,"Qalbingizdan o`chmas bo`lib izim qolur","Qalbingizdan o`chmas bo`lib izim qolur, Sog`inganda o`shal izni topolmaysiz. Chehrangizda mano boqqan ko`zim qolur, Dunyo kezib o`shal ko`zni topolmaysiz. Hayolingiz olib ketsa yiroqlarga," +
                   " Javob topmay qiynalsangiz so`roqlarga. Taskin topmay bosh ursangiz oyoqlarga, Taskinlarga loyiq so`zni topolmaysiz. Ko`zingizdan yoshlar oqib giryon bo`lsa, Kimligingiz o`zingizga ayon bo`lsa. Orzuyingiz o`ksikkina armon bo`lsa, Qadringizni Bilgan mandek. 'DO`ST'ni topolmaysiz!!!"))
           poemFriend.add(MyClass(false,4,"Davlatimni kup kuzlading","Davlatimni kup kuzlading, mayli dedim. Omadimga sherik bulding, mayli dedim. Sevgan yorimga ko`z tikding, mayli dedim. Aytgan suzlarimdan bilki, sira qaytmam. Mozorimga aslo borma, rozi bo`lmam. Do`stga do`st bo`lolmadik. Uzukka ko`z bo`lmadik. " +
                   "Yaxshi yomon deganda. Xech vafodor bo`lmadik. Bog`larimga xazon tulding, mayli dedim. Xavas emas xasad qilding, mayli dedim. Qo`llarimga kishan tutding, mayli dedim. Aytgan suzlarimdan bilki, sira qaytmam. Mozorimga aslo borma, rozi bulmam."))
           poemFriend.add(MyClass(false,4,"Mehr nima?","Mehr nima? Odamlarda xech topilmas matomidi? Qaxr nima? Nomardlarning og`rig`iga davomidi? Mexr berib, mexr kutib yashashimiz xatomidi? Yon atrofim to`la odam - topilmaydi biror inson. Tog`im deya suyanganim - dustlarimdan kunglim qoldi. Xar baloni kurib buldim, ko`rmaganim o`lim qoldi."))
           poemFriend.add(MyClass(false,4,"Xandon otib kulmasang","Xandon otib kulmasang, yig`latma meni. Agar obod qilmasang, qaqshatma meni. Agar baxtli etmasang, baxtim azaldan. Agar shodli qilmasang, buzlatma meni. Uzing dunyo kurmasdan, dunyo vada qilmagin. Daryo kurmay tashnasan, tulqin vada qilmagin. " +
                   "Bajarmaysan, bajarmaysan. Sarson qilma mani. Yaramaysan, yaramaysan. Vayron qilma mani."))
           poemFriend.add(MyClass(false,4,"Sog`indingmi demang sog`inish gapmi","Sog`indingmi demang sog`inish gapmi, Sizni sog`inmagan yurak yurakmi, Do`stlik men uchun yashash demakdir, Ahir siz-siz menga hayot kerakmi!"))

           poemJokes.add(MyClass(false,5,"Men seni sog`indim","Men seni sog`indim (Yurakdagi gap) Ko`rgim kelyapti (Xis xayajon gap) Qachon kelasan (So`roq gap) Men seni chin dildan sevaman (Bo`lmagan gap)"))
           poemJokes.add(MyClass(false,5,"Talabani nolasi Ana domla ko`rindi Suxbatimiz bo`lindi","Talabani nolasi Ana domla ko`rindi Suxbatimiz bo`lindi. Yuregimiz siqildi Puli yola yiqildi. Ana dars ham boshlandi Ko`zlarimiz yoshlandi. Qalbimiz g`ashlandi Domlamiz tashlandi." +
                   " Goh partaga yozamiz Gohida gap otamiz. Kop gapirmay betamiz Aytin qachon ketamiz? Yana azob yana dars Jonga tegdinku galvars! Hadeb sovol bermasdan Uxlashga qoyber bir pas! Meni qiynar paralar Yurak bolar poralar. Qachon javob bersan Lalaymasdan ayt ovsar! Urre katta tanaffus 40 minutada afsus..."))
           poemJokes.add(MyClass(false,5,"Kompyuter qarshisidagi qizga","Kompyuter qarshisidagi qizga... Xayolparast yigitmanda men Kompiyuter bo`lsaydim qani Ro`paramda o`tirarding sen Baxt bu qo`ling menga tekkani Boshqalarga qolardim o`chib Sen o`tirsang ishlardim uchib She`r o`qirding " +
                   "internet ochib Baxt bu qo`ling menga tekkani Kel xayolni chetga suraylik Rozi bo`lgin turmush quraylik Qo`l ushlashib birga yuraylik Baxt bu qo`ling menga tekkani.\n"))
           poemJokes.add(MyClass(false,5,"Sevgi Komp.","Sevgi Komp... Bilmam qanday virus ekan, Muhabbat vintini yer ekan. Yangi chiqan Lovisi ham, Undan besh battar ekan. Virusga qarshi Dokter web, O`zi hasta ekan sevgi dardini yeb. Kim huziriga borsa senda kuchli, Qo`rqitar Muhabbat istiroblari bor deb." +
                   " Ko`zlaringni yaxshilab och, Windowsdan nari qoch. Qalbingdagini E-mailiga choch, U ham qo`lingdan kelmasa, Kompyuterdan ham qoch.."))
           poemJokes.add(MyClass(false,5,"Bizning do`stligimiz havas qilgudek.","Bizning do`stligimiz havas qilgudek. Siz kulsez-kulaman Siz hafa bo`sez-hafa bo`laman. Siz oynadan sakrasez man ham... Yo`o`o`o`g`eeee saal adashdim tomosha qilib turaman. cool"))
           poemJokes.add(MyClass(false,5,"Kechasi tushumda","Kechasi tushumda, kunduzi xushumda. Qarashlaringiz sehrli, Sizsiz xayotim zerikarli. -debdi sichqon mushukka, bekinvolib teshikka."))
           poemJokes.add(MyClass(false,5,"Dollar seni sevgan men","Dollar seni sevgan men jinni Bunga sabab sen jinni Bo`lmasayding sen jinni Sevmas edim men jinni"))
           poemJokes.add(MyClass(false,5,"Arig`da suv oqadi ","Arig`da suv oqadi Suvda olma oqadi Bu smsni o`qigani Doim burni oqadi"))
           poemJokes.add(MyClass(false,5,"Uzin ekan bo`yingiz","Uzin ekan bo`yingiz shirin ekan so`zingiz Birin qoyib biriga ketar ekan ko`nglingiz"))
           poemJokes.add(MyClass(false,5,"Shaftoli qoqi","Men sizni sevaman olmani oqi Afsus siz ekansiz shaftoli qoqi"))

           array1List = poemLove
           array2List = poemMiss
           array3List = poemTabrik
           array4List = poemParent
           array5List = poemFriend
           array6List = poemJokes

        }



    }
}