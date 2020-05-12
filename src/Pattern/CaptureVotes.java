package Pattern;

import View.VotingFRM;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Victor Lavalle
 */
public class CaptureVotes extends Observed implements ActionListener {
private VotingFRM voting;
 private int[] votes;
 private String[] nominees;

 public CaptureVotes(String[] nominees){
    this.nominees = nominees;
    int[] votes = {0, 0, 0};
    this.votes = votes;
    this.voting = new VotingFRM();
    notifyAll(this.votes, this.nominees);
    voting.getVote().addActionListener(this);
    voting.getVote2().addActionListener(this);
    voting.getVote3().addActionListener(this);
    voting.setVisible(true);
 }
 
  @Override
 public void actionPerformed(ActionEvent e) {
    if(e.getSource() == voting.getVote()){
        votes[0] = votes[0] + 1;
        notifyAll(votes, nominees);
   }

    if(e.getSource() == voting.getVote2()){
      votes[1] = votes[1] + 1;
      notifyAll(votes, nominees);
   }

   if(e.getSource() == voting.getVote3()){
     votes[2] = votes[2] + 1;
     notifyAll(votes, nominees);
   }
 
 }


}
