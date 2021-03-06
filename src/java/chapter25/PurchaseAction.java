package chapter25;

import bean.Item;
import tool.Action;
import dao.PurchaseDAO;
import javax.servlet.http.*;
import java.util.List;

public class PurchaseAction extends Action {

    @SuppressWarnings("unchecked")
    public String execute(
            HttpServletRequest request, HttpServletResponse response
    ) throws Exception {

        HttpSession session = request.getSession();

        PurchaseDAO dao = new PurchaseDAO();
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        if (cart == null) {
            return "purchase-error-insert.jsp";
        }
        session.removeAttribute("cart");
        return "purchase-out.jsp";

    }
}
