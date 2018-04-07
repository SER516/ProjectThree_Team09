package ser516.project3.utilities;

import ser516.project3.client.view.*;
import ser516.project3.client.view.ExpressionsView;
import ser516.project3.constants.ClientConstants;
import ser516.project3.interfaces.ModelInterface;
import ser516.project3.interfaces.ViewInterface;
import ser516.project3.model.*;
import ser516.project3.server.view.*;

public class ViewFactory {
  public ViewInterface getView(String viewType, ModelInterface model){
    if(viewType == null){
      return null;
    }
    if(viewType.equalsIgnoreCase(ClientConstants.CLIENT)){
      return ClientView.getClientView();
    } else if(viewType.equalsIgnoreCase("SERVER")) {
      return ServerView.getServerView();
    } else if(viewType.equalsIgnoreCase(ClientConstants.HEADER)){
      return new HeaderView((HeaderModel) model);
    } else if(viewType.equalsIgnoreCase(ClientConstants.PERFORMANCE_METRICS)){
      return new PerformanceMetricView((PerformanceMetricModel) model);
    } else if(viewType.equalsIgnoreCase(ClientConstants.EXPRESSIONS)){
      return new ExpressionsView((ExpressionsModel) model);
    } else if(viewType.equalsIgnoreCase(ClientConstants.GRAPH)){
      return new GraphView((GraphModel) model);
    } else if(viewType.equalsIgnoreCase("TOP")){
      return new TopView((TopModel) model);
    } else if(viewType.equalsIgnoreCase("TIMER")){
      return new TimerView((TimerModel) model);
    } else if(viewType.equalsIgnoreCase("EMOTIONS")){
      return new EmotionsView((EmotionsModel) model);
    } else if(viewType.equalsIgnoreCase("SERVER_EXPRESSIONS")){
      return new ser516.project3.server.view.ExpressionsView((ExpressionsModel) model);
    } else if(viewType.equalsIgnoreCase("CONSOLE")){
      return new ConsoleView((ConsoleModel) model);
    }

    return null;
  }
}
