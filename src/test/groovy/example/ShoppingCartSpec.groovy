package example

import geb.Module
import geb.Page
import geb.spock.GebReportingSpec


class ShoppingCartSpec extends GebReportingSpec{

    def '檢查首頁是否存在購物車'() {
        to HomePage

        expect:
        shoppingCartModule.shoppingListTab.text() == '購物清單'
    }
}

class HomePage extends Page {

    static url = 'http://www.pubu.com.tw'

    static content = {
        shoppingCartModule { module ShoppingCartModule }
    }
}

class ShoppingCartModule extends Module {

    static content = {
        menuTab {$('#cart-slide .ui-tabs-anchor')}
        shoppingListTab { menuTab.getAt(0) }
        shoppingLogTab { menuTab.getAt(1) }
    }
}

