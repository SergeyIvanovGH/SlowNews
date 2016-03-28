package ua.com.univerpulse.servlet;

import ua.com.univerpulse.model.News;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "lastnewsservlet", urlPatterns = {"/lastnews"})
public class LastNewsServlet extends HttpServlet {
    private List<News> newsList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        fillArrayNews();

        req.setAttribute("newslist", newsList);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/lastnews.jsp");
        dispatcher.forward(req,resp);
    }

    private void fillArrayNews() {
        if (!newsList.isEmpty()) {
            return;
        }
        newsList.add(new News(
                "01.03.2016",
                "Three men charged with terror offences in Belgium",
                "Three men have been charged with terrorism offences in the aftermath of the Brussels attacks, prosecutors said.\n" +
                        "\n" +
                        "They were arrested during raids on 13 addresses on Sunday. A fourth man was released without charge.\n" +
                        "\n" +
                        "Meanwhile, the Belgian Crisis Centre said it had revised the death toll up to 31. So far 28 victims had been identified. Three attackers also died.\n" +
                        "\n" +
                        "The attacks at Brussels airport and on the metro were claimed by so-called Islamic State (IS).\n" +
                        "\n" +
                        "The three men - whose names were given as Yassine A, Mohamed B and Aboubaker O - were charged with participation in a terrorist group, the Belgian prosecutor's office said.\n" +
                        "\n" +
                        "More arrests have also taken place in relation to what authorities say were planned attacks on France.\n" +
                        "\n" +
                        "A man already in Belgian custody was reported to have been charged in connection with a foiled attack in the Paris region.\n" +
                        "\n" +
                        "Separately, Dutch police announced on Sunday evening that they had detained a Frenchman, 32, in Rotterdam at the request of French authorities.\n" +
                        "\n" +
                        "He was arrested on suspicion of preparing an attack in France and will be extradited to the country. Three other people were also detained.\n" +
                        "\n" +
                        "The Frenchman is allegedly linked to Reda Kriket, who was arrested in a Paris suburb on Thursday and said to be in the \"advanced stage\" of plotting an attack, AFP news agency reported citing a police source.",
                "images/news01.jpg")
        );
        newsList.add(new News("20.03.2016",
                "Credit Suisse to cut another 2,000 jobs",
                "Swiss banking giant Credit Suisse has announced that 2,000 jobs will go at its global markets business.\n" +
                        "\n" +
                        "The latest cuts are in addition to the 4,000 job cuts announced last month and are part of the bank's efforts to reduce annual costs by 800m Swiss francs a year (£580m; $820m).\n" +
                        "\n" +
                        "The company blamed a \"high and inflexible cost base\" and \"volatile market conditions\".\n" +
                        "\n" +
                        "The global markets business trades bonds and other financial products.\n" +
                        "'Disappointing' results\n" +
                        "\n" +
                        "Tidjane Thiam took over as chief executive of Credit Suisse last July, having spent six years leading the UK-based insurer Prudential.\n" +
                        "\n" +
                        "In a statement accompanying today's announcement, he described the performance of the global markets business as \"disappointing\", blaming the company's exposure to financial products that were difficult to trade in \"challenging\" market conditions.\n" +
                        "\n" +
                        "\"In this context, we have taken immediate action to reduce outsized positions in activities not consistent with our new strategy and systematically reduced our exposures,\" he said.\n" +
                        "Image copyright Reuters\n" +
                        "Image caption Credit Suisse chief executive Tidjane Thiam took over last July\n" +
                        "\n" +
                        "The bank is leaving some business areas altogether, including distressed credit products.\n" +
                        "\n" +
                        "Credit Suisse is investing in its equities (shares) business which it described as \"a core area of focus for the bank\".\n" +
                        "\n" +
                        "Credit Suisse expects to report a loss in the first quarter of 2016, due to a charge of $346m to cover the costs of the reorganisation.\n" +
                        "\n" +
                        "In 2015, the bank made a pre-tax loss of 2.4bn Swiss francs ($2.4bn; £1.6bn) - its first annual loss since 2008.",
                "images/news02.jpg")
        );
        newsList.add(new News("28.03.2016",
                "Lufthansa profits boosted by lower fuel costs",
                "German airline group Lufthansa has reported a 55% rise in underlying earnings to €1.8bn (£1.4bn), helped by lower fuel costs.\n" +
                        "\n" +
                        "The increase comes despite a series of strikes by pilots and cabin crew over changes to working conditions,\n" +
                        "\n" +
                        "Lufthansa said it would resume dividend payments to shareholders and forecast slightly higher profits in 2016.\n" +
                        "\n" +
                        "But it warned that competition from rivals would continue to put pressure on ticket prices.\n" +
                        "\n" +
                        "Lufthansa chief executive Carsten Spohr said that 2015 had been an \"emotionally challenging year\" following the Germanwings air crash, which killed 144 passengers and six crew members. ",
                "images/news03.jpg")
        );
        newsList.add(new News("28.03.2016",
                "Australian Grand Prix crash: Fernando Alonso suffers huge accident",
                "Fernando Alonso has walked away uninjured from a huge crash at the Australian Grand Prix.\n" +
                        "\n" +
                        "The two-time champion's McLaren was launched into the air and came to rest upside down after hitting the back of Esteban Gutierrez's Haas.\n" +
                        "\n" +
                        "Alonso was able to climb out of the wreckage unaided after the incident at Turn Three at Albert Park.\n" +
                        "\n" +
                        "The Spaniard was taken to the medical centre for a check-up and subsequently released.\n" +
                        "Gutierrez and Alonso walk away from their cars\n" +
                        "\"It was a very scary moment. I was really worried and ran to him and it was a really big relief to see that everything was OK. It was a real moment of shock for both of us,\" said Gutierrez\n" +
                        "\n" +
                        "\"I feel good. I'm trying to put everything in place again in the body. It was a big, big crash,\" Alonso told BBC Radio 5 live.\n" +
                        "\n" +
                        "\"I tried to take the slipstream until the braking point and in the last moment it was a combination of factors that ended up in a crash, luckily we are both OK.\n" +
                        "\n" +
                        "\"I'm thankful for the safety of the cars - I am alive talking to you.\n" +
                        "\n" +
                        "\"I think it is a race incident. We both tried to fight and sometimes we forget we are at 300km/h and every little crash can become much bigger.\"",
                "images/news04.jpg")
        );
    }
}
